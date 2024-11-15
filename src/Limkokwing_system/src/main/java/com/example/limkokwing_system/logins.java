package com.example.limkokwing_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class logins {

    public static String fxml;
    @FXML
    private Button btnsignin;

    @FXML
    private Button btnsignup;

    @FXML
    private Label lblpassword;

    @FXML
    private Label lblusername;

    @FXML
    private TextField txtpassword;

    @FXML
    private TextField txtusername;

    @FXML
    void signin(ActionEvent event) throws IOException {
        String username = txtusername.getText();
        String password = txtpassword.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Please fill in both fields.");
            return;
        }

        try  {
            Connection connection = DatabaseConnection.connect();
            Statement stmt = connection.createStatement();
            String query = "SELECT role FROM create_account WHERE username ='"+username+"' AND password = '"+password+"'";
            ResultSet resultSet = stmt.executeQuery(query);

            if (resultSet.next()) {

                if ("admin".equals(resultSet.getString(1))) {
                    Stage myStage = new Stage();
                    String title = "Admin Panel";
                    HelloApplication.nav(myStage, "adminpanel.fxml", title.toUpperCase(), 800, 600);
                } else {
                    showAlert("You do not have admin access.");
                }
            } else {
                showAlert("Invalid username or password.");
            }

        } catch (SQLException e) {
            showAlert("Error during sign-in: " + e.toString());
        }


    }

    @FXML
    void signup(ActionEvent event) throws IOException {
        Stage myStage = new Stage();
        String title = "Create Account Form";
        HelloApplication.nav(myStage, "signup.fxml", title.toUpperCase(), 600, 400);
    }

    // Method to show alert messages
    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
