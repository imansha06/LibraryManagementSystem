package com.library.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private void login() {

        if (usernameField.getText().isEmpty() ||
                passwordField.getText().isEmpty()) {

            errorLabel.setText("Please enter username and password.");

        } else {

            errorLabel.setText("Login successful!");
        }
    }

    @FXML
    private void clear() {

        usernameField.clear();
        passwordField.clear();
        errorLabel.setText("");
    }
}