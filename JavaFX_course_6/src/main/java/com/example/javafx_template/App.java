package com.example.javafx_template;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is a template to make JavaFX projects (with or without CSS).
 * Remember to make use of MVC and SceneBuilder.
 * Open SceneBuilder by right-clicking on the App.xml file in the 'resources' folder
 */

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("App.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Simple Logout v1");

        // Should always be at the end of the start-method
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume(); // hinters logout to preset when event canceled
            logout(stage); // only applies when 'ok' is pressed in close request
        });
    }

    public void logout(Stage stage){
        // Create alert before closing window
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to exit program?");

        // The alert is a Dialog class and makes use of showAndWait method
        if (alert.showAndWait().get() == ButtonType.OK){
            // Logout of window
            System.out.println("You've successfully logged out!");
            stage.close();
        }
    }

}