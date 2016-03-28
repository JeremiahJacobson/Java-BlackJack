package blackjackfx;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author jjacobson
 *
 */
public class BlackjackGamePane extends Pane {

    public BlackjackGamePane()
    {
        IntroPane introPane = new IntroPane();
        PlayPane playPane = new PlayPane();
        introPane.getStartButton().setOnMousePressed((MouseEvent e) ->
        {
            introPane.getStartButton().setGraphic(introPane.getSecondStartButtonImageView());
        });
        introPane.getStartButton().setOnMouseReleased((MouseEvent e) ->
        {
            BlackjackGamePane.this.getChildren().remove(introPane);
            BlackjackGamePane.this.getChildren().add(playPane);
        });

        this.getChildren().add(introPane);
    }

}
