package com.example.javafx_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private CheckBox checkBox;

    @FXML
    private Label label;

    @FXML
    private ImageView imageView;

    @FXML
    private Label counter;

    int count = 1;

    Image imageBulbOff = new Image(getClass().getResourceAsStream("bulb1.png"));
    Image imageBulbOn = new Image(getClass().getResourceAsStream("bulb2.png"));

    public void change(ActionEvent event){

        if (checkBox.isSelected()){
            label.setText("ON");
            imageView.setImage(imageBulbOn);
            counter.setText("Counter: "+ (count++));
        } else {
            label.setText("OFF");
            imageView.setImage(imageBulbOff);
        }

    }

}