/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Utility.Cronometro;
import Utility.RandomMatriz;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import java.io.IOException;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author sebas
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private GridPane matrizJuego;
    @FXML
    private Button botonReiniciar;
    @FXML
    private Button botonIniciar;
    @FXML
    private Label timerLabel;
    @FXML
    private Pane gamePane;
    @FXML
    private Pane inicioPane;

    static int numero = 0;
    @FXML
    private AnchorPane anchorPane;

    private Cronometro crono;

    double anchoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    double altoPantalla = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 1; i < numero + 1; i++) {
            for (int j = 1; j < numero + 1; j++) {
                ToggleButton nuevoBoton = new ToggleButton(" ");
                nuevoBoton.setPrefWidth(15);
                nuevoBoton.setPrefHeight(15);

                nuevoBoton.setOnAction((ActionEvent events) -> {
                    rellenoMatriz();
                });
                matrizJuego.add(nuevoBoton, i, j);
            }
        }
    }

    public void inicio() throws IOException {

        //Stage stage2 = (Stage) this.inicio.getScene().getWindow(); stage2.close();  
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root2);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void accionReiniciar(ActionEvent event) {
        crono.ReiniciarCronometro();
    }

    public void rellenoMatriz() {

    }

    @FXML
    public void iniciarJuego(ActionEvent event) {

        inicioPane.setVisible(false);
        gamePane.setVisible(true);
        crono = new Cronometro();
        crono.IniciarCronometro();

    }
}
