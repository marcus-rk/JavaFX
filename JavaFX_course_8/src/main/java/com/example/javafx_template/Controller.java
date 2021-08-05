package com.example.javafx_template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label topLabel;
    @FXML
    private TextField submitTextfield;

    int age;

    public void submit(ActionEvent event){

        // Try-catch to check for only int input and over 18
        try {
            // Parse input String to int
            age = Integer.parseInt(submitTextfield.getText());

            // Check for age over 18
            if (age >= 18){
                topLabel.setText("Confirmed input!");
            } else {
                topLabel.setText("Must be over 18 :(");
            }
        } catch (NumberFormatException e){
            topLabel.setText("Enter int as input!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}