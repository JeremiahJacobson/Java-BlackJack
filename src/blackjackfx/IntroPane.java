package blackjackfx;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author jjacobson
 *
 */
public class IntroPane extends Pane {

    private Button startButton;
    private Ellipse buttonShape;
    private ImageView secondStartButtonImageView;

    public IntroPane()
    {
        //Set the button shape to ellipse to conform to the shape of the button
        buttonShape = new Ellipse();
        //button image copied from http://www.prodraw.net/
        Image startButtonImage = new Image("starButton.png");
        ImageView startButtonImageView = new ImageView(startButtonImage);
        Image secondStartButtonImage = new Image("secondButtonGraphic.png");
        secondStartButtonImageView = new ImageView(secondStartButtonImage);
        startButton = new Button();//Button to get started
        startButton.setGraphic(startButtonImageView);
        startButton.setShape(buttonShape);
        //Set button actions

        //Position on the pane
        startButton.setLayoutX(500);
        startButton.setLayoutY(550);

        Image backgroundImage = new Image("/blackjackStartPane.png.png", true);//Background backgroundImage for the IntroPane
        ImageView imageView = new ImageView(backgroundImage);
        this.getChildren().add(imageView);
        this.getChildren().add(startButton);

    }

    public Button getStartButton()
    {
        return startButton;
    }

    public void setStartButton(Button startButton)
    {
        this.startButton = startButton;
    }

    public Ellipse getButtonShape()
    {
        return buttonShape;
    }

    public void setButtonShape(Ellipse buttonShape)
    {
        this.buttonShape = buttonShape;
    }

    public ImageView getSecondStartButtonImageView()
    {
        return secondStartButtonImageView;
    }

    public void setSecondStartButtonImageView(ImageView secondStartButtonImageView)
    {
        this.secondStartButtonImageView = secondStartButtonImageView;
    }

}
