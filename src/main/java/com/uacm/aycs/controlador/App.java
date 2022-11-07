package com.uacm.aycs.controlador;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


/**
 * JavaFX App
 */
public class App extends Application 
{

    private static Scene scene;
    
    public void start(Stage primaryStage) throws IOException 
    {
        scene = new Scene(loadFXML("/vista/menu"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private static Parent loadFXML(String fxml)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) 
    {
        launch();
    }

}