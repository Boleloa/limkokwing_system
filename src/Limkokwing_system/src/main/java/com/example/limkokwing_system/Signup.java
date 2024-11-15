package com.example.limkokwing_system;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Signup {
    public void createaccount(ActionEvent actionEvent) throws IOException {

        Stage myStage = new Stage();
        String title = "Signup Form";
        HelloApplication.nav(myStage, "signup.fxml", title.toUpperCase(), 600, 400);
    }
}
