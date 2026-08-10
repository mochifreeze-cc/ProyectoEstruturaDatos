/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espol.proyectoestruturadatos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author USER
 */

public class ProyectoEstructuraDatos extends Application{
    public static void main(String[] args){
        System.out.println("HOLA");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hola mundo");
        StackPane root=new StackPane();
        root.getChildren().add(label);
        Scene scene=new Scene(root,300,250);
        stage.setScene(scene);
        stage.setTitle("Java");
        stage.show();
    }
}
