package com.uacm.aycs.controlador;

import com.uacm.aycs.modelo.Receta;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joel-
 */
public class LocalizarController implements Initializable 
{

    @FXML
    private TextField campoNumSeguro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void buscar(ActionEvent event) 
    {
        String noSeguro = this.campoNumSeguro.getText();
        Receta r = new Receta();
        r.buscarReceta(noSeguro);
    }

    @FXML
    private void regresar(ActionEvent event) 
    {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }   
}