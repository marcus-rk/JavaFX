package com.example.javafx_template;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class Scene2Controller {

    @FXML
    Label nameLabel;

    public void displayName(String username) throws IOException {
        nameLabel.setText("Your username is: " + username);
    }

}