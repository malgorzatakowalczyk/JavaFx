/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.awt.Image;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Malgorzata Kowalczyk
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField number;

    @FXML
    void handleButtonAction(ActionEvent event) {
        String change = ((ToggleButton) event.getSource()).getText();
        if (((ToggleButton) event.getSource()).isSelected()) {
            number.setText(change);
        }
    }
    public void door(ActionEvent ev) {
        String sign = ((Button)ev.getSource()).getText();
        number.setText(sign);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
