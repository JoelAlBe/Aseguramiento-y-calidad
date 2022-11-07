package com.uacm.aycs.controlador;

import com.uacm.aycs.modelo.Receta;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joel-
 */
public class MenuController implements Initializable 
{

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void crear(ActionEvent event) 
    {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/PlantillaReceta.fxml"));
            
            Stage secundaryStage = new Stage();
            Pane pane = (Pane) loader.load();
            
            Scene scene = new Scene(pane);
            
            secundaryStage.initModality(Modality.APPLICATION_MODAL);
            secundaryStage.setScene(scene);
            secundaryStage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }

    @FXML
    private void leerReceta(ActionEvent event) 
    {
        buscarVentana();
    }

    @FXML
    private void actualizar(ActionEvent event) 
    {
        buscarVentana();
    }

    @FXML
    private void eliminar(ActionEvent event) 
    {
        buscarVentana();
    }

    @FXML
    private void cerrar(ActionEvent event) 
    {
        System.exit(0);
    }

    @FXML
    private void mostrarInfo(ActionEvent event) 
    {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Informacion.fxml"));
            
            Stage secundaryStage = new Stage();
            Pane pane = (Pane) loader.load();
            
            Scene scene = new Scene(pane);
            
            secundaryStage.initModality(Modality.APPLICATION_MODAL);
            secundaryStage.setScene(scene);
            secundaryStage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    
    private void buscarVentana()
    {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Localizar.fxml"));
            
            Stage secundaryStage = new Stage();
            Pane pane = (Pane) loader.load();
            
            Scene scene = new Scene(pane);
            
            secundaryStage.initModality(Modality.APPLICATION_MODAL);
            secundaryStage.setScene(scene);
            secundaryStage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
}