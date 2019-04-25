/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author chicnahuicoatl
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void picaO(ActionEvent evento){
        System.out.println("Botón 0 picado");
    }
    
    @FXML
    private void picaI(ActionEvent evento){
        System.out.println("Botón 1 picado");
    }
    
    @FXML
    private void picaII(ActionEvent evento){
        System.out.println("Botón 2 picado");
    }
    
    @FXML
    private void picaIII(ActionEvent evento){
        System.out.println("Botón 3 picado");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
