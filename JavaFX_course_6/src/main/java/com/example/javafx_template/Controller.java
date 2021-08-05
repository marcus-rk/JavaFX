package com.example.javafx_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button logoutButton;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void logout(ActionEvent e){
        // Create alert before closing window
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to exit program?");

        // The alert is a Dialog class and makes use of showAndWait method
        if (alert.showAndWait().get() == ButtonType.OK){
            // Get current stage
            stage = (Stage) scenePane.getScene().getWindow();

            // Logout of window
            System.out.println("You've successfully logged out!");
            stage.close();
        }
    }

}