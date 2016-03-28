package blackjackfx;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author jjacobson 
 * 
 */
public class Card extends Pane {

    Suit suit;
    Value value;
    private int rank;
    private final Image cardBackImage = new Image("cardBack.png");
    private final ImageView cardBackImageView = new ImageView(cardBackImage);

    /**
     *
     * @param suit
     * @param value
     * @param cardImage
     */
    public Card(Suit suit, Value value, ImageView cardImage)
    {
        this.setWidth(75);
        this.setHeight(100);
        this.suit = suit;
        this.value = value;
        //Set Images for cards
        this.getChildren().add(cardImage);

    }

    public int getRank()
    {
        return rank;
    }

    public void setRank(int rank)
    {
        this.rank = this.value.rank;
    }

    public void isFaceDown(boolean answer)
    {
        if (answer == true)
        {
            this.getChildren().add(cardBackImageView);

        }

    }

    public void turnFaceUp()
    {
        this.getChildren().remove(cardBackImageView);
    }

}
