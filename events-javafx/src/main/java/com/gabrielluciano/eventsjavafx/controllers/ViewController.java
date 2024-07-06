package com.gabrielluciano.eventsjavafx.controllers;

import com.gabrielluciano.eventsjavafx.util.Alerts;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        System.out.println("Button clicked");
        Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.WARNING);
    }
}
