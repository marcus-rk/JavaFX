package com.example.javafx_template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is a template to make JavaFX projects.
 * Remember to make use of MVC and SceneBuilder.
 * Open SceneBuilder by right-clicking on the App.xml file in the 'resources' folder
 */

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(App.class.getResource("App.fxml"));
        Scene scene = new Scene(root.load(), 600, 400);
        stage.setTitle("CSS Stylesheet demo");

        // Link css stylesheet to scene
        String css = this.getClass().getResource("App.css").toExternalForm();
        scene.getStylesheets().add(css);

        // Should always be at the end of the start-method
        stage.setScene(scene);
        stage.show();
    }
}