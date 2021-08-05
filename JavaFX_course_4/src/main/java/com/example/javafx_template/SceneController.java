package com.example.javafx_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent e) throws IOException {
        root = FXMLLoader.load(App.class.getResource("Scene1.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent e) throws IOException {
        root = FXMLLoader.load(App.class.getResource("Scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}