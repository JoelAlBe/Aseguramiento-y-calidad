package com.uacm.aycs.controlador;

import com.uacm.aycs.modelo.Receta;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joel-
 */
public class PlantillaRecetaController implements Initializable 
{

    @FXML
    private TextField fecha;
    @FXML
    private TextField nombrePaciente;
    @FXML
    private TextField edad;
    @FXML
    private TextField peso;
    @FXML
    private TextField talla;
    @FXML
    private TextField temperatura;
    @FXML
    private TextField presion;
    @FXML
    private TextField sexo;
    @FXML
    private TextArea alergias;
    @FXML
    private TextArea medicamentos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {

    }    

    @FXML
    private void guardarReceta(ActionEvent event) throws SQLException 
    {
        String fecha = this.fecha.getText();
        String nombre = this.nombrePaciente.getText();
        String edad = this.edad.getText();
        String peso = this.peso.getText();
        String talla = this.talla.getText();
        String temperatura = this.temperatura.getText();
        String presion = this.presion.getText();
        String sexo = this.sexo.getText();
        String alergias = this.alergias.getText();
        String campo = this.medicamentos.getText();
        
        Receta receta = new Receta();
        int flag = receta.guardarReceta(fecha, nombre, edad, peso, talla, temperatura, presion, sexo, alergias, campo);
        
        if(flag==1)
        {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Correcto.fxml"));
            
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
        
        else
        {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Error.fxml"));
            
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

    @FXML
    private void cerrarVentana(ActionEvent event) 
    {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void limpiarCampos(ActionEvent event)
    {
        fecha.setText("");
        nombrePaciente.setText("");
        edad.setText("");
        peso.setText("");
        talla.setText("");
        temperatura.setText("");
        presion.setText("");
        sexo.setText("");
        alergias.setText("");
        medicamentos.setText("");
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
}