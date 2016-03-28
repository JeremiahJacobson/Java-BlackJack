/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author jjacobson
 */
public class BlackJackFx extends Application {

    @Override
    public void start(Stage primaryStage)
    {

        BlackjackGamePane gamePane = new BlackjackGamePane();

        //Create a scene and place it in the stage
        Scene scene = new Scene(gamePane, 1240, 620);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Blackjack");// Set the stage title
        primaryStage.setScene(scene);// Place the scene in the stage
       
        primaryStage.show();// Display the stage

    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
