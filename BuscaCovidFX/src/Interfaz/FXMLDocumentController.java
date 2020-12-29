/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;

/**
 *
 * @author sebas
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private GridPane matrizJuego;
    @FXML
    private Button botonReiniciar;
    
    int numero=8;
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                ToggleButton nuevoBoton = new ToggleButton(" "); 
                nuevoBoton.setPrefWidth(40);
                nuevoBoton.setPrefHeight(40);  
                
                nuevoBoton.setOnAction((ActionEvent events)->{
                    rellenoMatriz();
                });
                matrizJuego.add(nuevoBoton, i, j);   
            }
        }
    }    

    @FXML
    private void accionReiniciar(ActionEvent event) { 
        
        
    }
    
    public void rellenoMatriz(){
       for (int i = 0; i < matrizJuego.getChildren().size(); i++) {
            System.out.println(i);
        }
        
        
    }
}
