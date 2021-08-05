package com.example.javafx_template;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    // Image can be seen as a Photograph
    // ImageView can be seen as a picture frame

    @FXML
    ImageView imageView;
    Button imageButton;
    Image image = new Image(getClass().getResourceAsStream("programming_meme2.png"));

    public void displayImage(){
        imageView.setImage(image);
    }

}