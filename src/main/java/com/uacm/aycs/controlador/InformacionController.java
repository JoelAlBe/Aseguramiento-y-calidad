package com.uacm.aycs.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joel-
 */
public class InformacionController implements Initializable 
{

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void cerrar(ActionEvent event) 
    {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }   
}