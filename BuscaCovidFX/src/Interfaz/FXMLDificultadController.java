package Interfaz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class FXMLDificultadController {

    @FXML
    private Button dificultad1;

    @FXML
    private Button dificultad2;

    @FXML
    private Button dificultad3;
    
    FXMLDocumentController controller = new FXMLDocumentController(); 

    @FXML
    private void accionPrincipiante(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();//cerrar ventana
        FXMLDocumentController.numero = 9;
        controller.inicio(); 
    }

    @FXML
    private void accionIntermedio(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();//cerrar ventana
        FXMLDocumentController.numero = 16;
        controller.inicio();
    }

    @FXML
    private void accionAvanzado(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();//cerrar ventana
        FXMLDocumentController.numero = 32;
        controller.inicio();
        
    }
}
