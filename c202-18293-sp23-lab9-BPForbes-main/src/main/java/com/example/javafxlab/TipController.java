package com.example.javafxlab;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class TipController {
    @FXML
    private TextField total;

    @FXML
    private ChoiceBox<Service> choiceBox;

    @FXML
    public void initialize() {
        choiceBox.getItems().addAll(
            Service.NO_TIP,
            Service.CASH,
            Service.POOR,
            Service.GOOD,
            Service.EXCELLENT,
            Service.GREAT
        );
        choiceBox.setValue(Service.GOOD);
        total.setEditable(false);
    }

    @FXML
    protected void onCalculateClick() {
        try {
            // Get the bill and service
            double bill = Double.parseDouble(total.getText());
            Service service = choiceBox.getValue();

            // Calculate the tip and total amount
            double tip = service.tip();
            double totalAmount = bill + tip;

            // Display the tip and total amount
            tipLabel.setText("$" + tip);
            totalLabel.setText("$" + totalAmount);
        } catch (NumberFormatException ex) {
            total.setText("Enter a valid bill amount");
        }
    }
}
