/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Malgorzata Kowalczyk
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private StackPane knob;

    public void movement(MouseEvent event) {
        double x = event.getSceneX();
        if (x < 140 && x > -140) {
            knob.setStyle("-fx-rotate:" + x + ";");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
