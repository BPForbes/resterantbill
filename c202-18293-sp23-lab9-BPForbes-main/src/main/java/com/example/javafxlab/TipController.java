package com.example.javafxlab;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class TipController {
    @FXML
    private TextField total;

    // Several more things to bind to the UI here

    @FXML
    public void initialize() {
        total.setEditable(false);
        // More here
    }

    @FXML
    protected void onCalculateClick() {
        try {
            // Get the bill and calculate here
        } catch (NumberFormatException ex) {
            total.setText("Enter a valid bill amount");
        }
    }
}