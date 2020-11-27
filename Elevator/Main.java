/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Malgorzata Kowalczyk
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
     
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Font.loadFont( Main.class.getResource("Segment.ttf").toExternalForm(), 10 );
        Scene scene = new Scene(root);
     
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
