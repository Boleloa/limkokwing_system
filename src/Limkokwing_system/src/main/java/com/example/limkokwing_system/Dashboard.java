package com.example.limkokwing_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {

    public void signup(ActionEvent actionEvent) throws IOException {
        Stage myStage = new Stage();
        String title = "Signup Form";
        HelloApplication.nav(myStage, "signup.fxml", title.toUpperCase(), 600, 400);
    }

    public void signin(ActionEvent actionEvent) throws IOException {
        Stage myStage = new Stage();
        String title = "Dashboard";
        HelloApplication.nav(myStage, "adminpanel.fxml", title.toUpperCase(), 600, 400);
    }
}
