package com.example.javafx_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Scene1Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String input;

    @FXML
    TextField nameTextField;

    public void signIn(ActionEvent e) throws IOException{
        // Get text from nameTextField
        input = nameTextField.getText();

        // Get access to Scene2.fxml and load xml.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();

        // Insert input to Scene2Controller's displayName method
        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(input);

        // Switch to scene 2
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}