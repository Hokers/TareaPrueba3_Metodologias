/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author sebas
 */
public class FXMLDocumentController implements Initializable {
    
    puntaje casillas;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    class casilla extends Button {
        private boolean descubierta;
        casilla(){
            descubierta = false;
        }
        public void descubrir(){
            descubierta= true;
        }
        public boolean estado(){
            return descubierta;
        }
}
    public void cuentaCasillas(casilla matriz [][]){//Cuenta casillas descubiertas
        
        int casilla=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j].estado()==true ){
                    casilla+=1;
                }
            }
        }
        casillas.sumaPuntaje(casilla);
    }
    
}
