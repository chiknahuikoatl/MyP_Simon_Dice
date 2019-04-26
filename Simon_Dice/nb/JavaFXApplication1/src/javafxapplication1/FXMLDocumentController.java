/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Text;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author chicnahuicoatl
 */
public class FXMLDocumentController implements Initializable {

    private Modelo modelo;
    private Rectangle recO = new Rectangle();
    private boolean continuaJuego = true;

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @FXML
    private void facil(ActionEvent evento)throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("Facil.fxml"));
        Scene scene = new Scene(root,450,450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        modelo = new Modelo(0);
        modelo.turno();
        /*
        while(continuaJuego){
            Vector<Integer> secuenciaColores = modelo.getSecuenciaColores();
            Iterator<Integer> iterador = secuenciaColores.iterator();
            while(iterador.hasNext()){
                System.out.println("Estoy vivo");
            }
        }
        stage.close();
        */
    }


    @FXML
    private void picaO(ActionEvent evento){
       /*
         try{
            modelo.tiroJugador(0);
        }catch(IllegalArgumentException e){
            continuaJuego = false;
        }
        */
       recO.setFill(new Color(0.117647,0.564706,1,0.2));
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
        System.out.println("Inicio");

    }

}
