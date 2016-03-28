package blackjackfx;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author jjacobson
 *
 */
public class PlayPane extends Pane {

    private Timeline animation;

    public PlayPane()
    {

        Image backgroundImage = new Image("playTable.png");
        ImageView backgroundImageView = new ImageView(backgroundImage);
        SimpleBooleanProperty dealable = new SimpleBooleanProperty(true);
        SimpleBooleanProperty hitable = new SimpleBooleanProperty(false);

        Shoe shoe = new Shoe();
        Hand myHand = new Hand();
        Hand dealerHand = new Hand();
        Text myHandText = new Text();
        Text dealerHandText = new Text();
        String playerString = "You: ";
        String dealerString = "Dealer: ";

        Button hitButton = new Button("Hit");
        hitButton.setLayoutX(275);
        hitButton.setLayoutY(525);
        hitButton.disableProperty().bind(dealable);
        hitButton.disableProperty().bind(hitable.not());

        Button stayButton = new Button("Stay");
        stayButton.setLayoutX(275);
        stayButton.setLayoutY(550);
        stayButton.disableProperty().bind(dealable);

        //Create and define the "Deal" button
        Button dealButton = new Button("Deal");
        dealButton.setLayoutX(275);
        dealButton.setLayoutY(500);
        dealButton.disableProperty().bind(dealable.not());

        //Layout values or the card images on the pane
        int myHandXLayout = 575;
        int myHandYlayout = 400;

        int dealerHandXLayout = 575;
        int dealerHandYLayout = 150;

        //dealButton action
        dealButton.setOnMouseClicked((MouseEvent e) ->
        {

            deal(myHand, dealerHand, shoe, backgroundImageView, dealButton, hitButton,
                    stayButton, myHandText, hitable, dealable,
                    myHandXLayout, myHandYlayout, dealerHandXLayout, dealerHandYLayout);

        });

        //Create and define the "Hit" button.
        hitButton.setOnMouseClicked((MouseEvent e) ->
        {

            this.getChildren().remove(myHandText);

            hit(shoe, myHand, dealable, hitable, myHandText, playerString, myHandYlayout);

        });

        //Create and define "Stay button
        stayButton.setOnMouseClicked((MouseEvent e) ->
        {
            hitable.set(false);
            this.getChildren().remove(dealerHandText);
            dealerHand.getCard(0).turnFaceUp();
            dealerHandText.setText("Dealer: " + dealerHand.getHandValue());
            dealerHandText.setLayoutX(575);//Text describing the numerical values of both the player and dealer hands
            dealerHandText.setLayoutY(125);
            this.getChildren().add(dealerHandText);
            if (myHand.getHandValue() == dealerHand.getHandValue())//If its a tie when dealers hand revealed
            {

                Text push = new Text("PUSH");//Create the "PUSH" message
                push.setLayoutX(300);
                push.setLayoutY(200);
                this.getChildren().add(push);// add it to the pane
                dealable.set(true);
            }
            if (dealerHand.getHandValue() > myHand.getHandValue() && dealerHand.getHandValue() < 22)
            {
                //If dealer's hand value is better than users and less than 21, dealer wins. 
                Text dealerWinText = new Text("Dealer: WIN");// Create the "dealer: WIN!" message
                dealerWinText.setLayoutX(300);
                dealerWinText.setLayoutY(200);
                this.getChildren().add(dealerWinText);// add it jto the pane
                dealable.set(true);

            }
            //If neither of the above conditions are met then proceed with the dealer "hitting"
            while (dealerHand.getHandValue() < myHand.getHandValue()
                    && (dealerHand.getHandValue() < 21))
            {
                try
                {
                    Thread.sleep(50);

                    hit(shoe, dealerHand, dealable, hitable, dealerHandText, dealerString, dealerHandYLayout);

                    if (myHand.getHandValue() == dealerHand.getHandValue())
                    {
                        this.getChildren().remove(dealerHandText);
                        Text push = new Text("PUSH");
                        push.setLayoutX(300);
                        push.setLayoutY(200);
                        this.getChildren().add(push);
                        dealable.set(true);
                    }

                    if (dealerHand.getHandValue() > 21)
                    {

                        dealable.set(true);
                    }

                    if (dealerHand.getHandValue() > myHand.getHandValue() && dealerHand.getHandValue() < 22)
                    {
                        Text dealerWinText = new Text("Dealer: WIN");
                        dealerWinText.setLayoutX(300);
                        dealerWinText.setLayoutY(200);
                        this.getChildren().add(dealerWinText);
                        dealable.set(true);

                    }
                    if (dealerHand.getHandValue() == myHand.getHandValue())
                    {
                        Text pushText = new Text("PUSH");
                        pushText.setLayoutX(300);
                        pushText.setLayoutY(200);
                        this.getChildren().add(pushText);
                        dealable.set(true);

                    }
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(PlayPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        );

        this.getChildren().addAll(backgroundImageView, dealButton, hitButton, stayButton);
        hitable.set(false);

    }

    private void hit(Shoe shoe, Hand hand, SimpleBooleanProperty dealable,
            SimpleBooleanProperty hitable, Text handText, String playerString,
            int cardYLayout)
    {
        this.getChildren().remove(handText);
        hand.add(hand.size(), shoe.pop());
        hand.getCard(hand.size() - 1).setLayoutY(cardYLayout);
        hand.get(hand.size() - 1).setLayoutX(hand.get(hand.size() - 2).getLayoutX() + 25);
        hand.setHandValue();
        handText.setText(playerString + hand.getHandValue());
        this.getChildren().add(handText);
        this.getChildren().add(hand.get(hand.size() - 1));
        if (hand.getHandValue() == 21)
        {
            hitable.set(false);
            Text winText = new Text(playerString + "WIN!");
            winText.setLayoutX(300);
            winText.setLayoutY(200);
            this.getChildren().add(winText);
            dealable.set(true);
            hitable.set(false);
        }
        if (hand.getHandValue() > 21)
        {
            hitable.set(false);
            Text bustText = new Text(playerString + "BUST!");

            bustText.setLayoutX(300);
            bustText.setLayoutY(200);
            this.getChildren().add(bustText);

            dealable.set(true);
            hitable.set(false);

        }
    }

    private void deal(Hand myHand, Hand dealerHand, Shoe shoe,
            ImageView backgroundImageView, Button dealButton, Button hitButton,
            Button stayButton, Text myHandText,
            SimpleBooleanProperty hitable, SimpleBooleanProperty dealable,
            int myHandXLayout, int myHandYLayout, int dealerHandXLayout,
            int dealerHandYLayout)
    {

        myHand.clear();//Clearing both hands
        dealerHand.clear();
        this.getChildren().clear();//Clearing the pane
        this.getChildren().addAll(backgroundImageView, dealButton,
                hitButton, stayButton);//Repopulating the pane with fresh nodes
        myHand.add(shoe.pop());//Dealing the both the dealer and player
        dealerHand.add(shoe.pop());
        myHand.add(shoe.pop());
        dealerHand.add(shoe.pop());
        //setting the layout of the cards on the pane
        myHand.getCard(0).setLayoutY(myHandYLayout);
        myHand.getCard(1).setLayoutY(myHandYLayout);
        myHand.getCard(0).setLayoutX(myHandXLayout);
        myHand.getCard(1).setLayoutX(myHand.getCard(0).getLayoutX() + 25);
        dealerHand.getCard(0).setLayoutY(dealerHandYLayout);
        dealerHand.getCard(0).isFaceDown(true);
        dealerHand.getCard(1).setLayoutY(dealerHandYLayout);
        dealerHand.getCard(0).setLayoutX(dealerHandXLayout);
        dealerHand.getCard(1).setLayoutX(dealerHandXLayout + 25);
        this.getChildren().addAll(myHand.getCard(0), dealerHand.getCard(0), myHand.getCard(1),
                dealerHand.getCard(1));//Adding all card Images to the pane
        myHand.setHandValue();//Setting the numerical values to each the player and dealer hands
        dealerHand.setHandValue();

        myHandText.setText("Me: " + myHand.getHandValue());
        myHandText.setLayoutX(575);
        myHandText.setLayoutY(530);
        this.getChildren().add(myHandText);

        hitable.set(true);//Enabling the Hit Button
        dealable.set(false);//Disabling the deal button
        if (myHand.getHandValue() == 21)
        {
            Text naturalBlackJackText = new Text("Natural BlackJack! You Win!");
            naturalBlackJackText.setLayoutX(300);
            naturalBlackJackText.setLayoutY(200);
            this.getChildren().add(naturalBlackJackText);
            hitable.set(false);
            dealable.set(true);
        }
    }

}
