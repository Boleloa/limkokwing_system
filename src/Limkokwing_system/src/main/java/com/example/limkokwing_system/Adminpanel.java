package com.example.limkokwing_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Adminpanel {

    @FXML
    private Button btnacademiccomponents;

    @FXML
    private Button btnlecturermanagement;

    @FXML
    private Button btnlogout;

    @FXML
    private Button btnstudentmanagement;

    @FXML
    private Button btnviewanalytics;

    @FXML
    void academic(ActionEvent event) throws IOException {
        Stage myStage = new Stage();
        String title = "Acamedic Details";
        HelloApplication.nav(myStage, "AcamedicComponents.fxml", title.toUpperCase(), 600, 400);

    }

    @FXML
    void analytics(ActionEvent event) throws IOException {
        Stage myStage = new Stage();
        String title = "Limkokwing Performance dashboard ";
        HelloApplication.nav(myStage, "Admin.fxml", title.toUpperCase(), 600, 400);

    }

    @FXML
    void lecturer(ActionEvent event) throws IOException {
        Stage myStage = new Stage();
        String title = "lecturer details Form";
        HelloApplication.nav(myStage, "lecturermanagement.fxml", title.toUpperCase(), 600, 400);

    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Stage myStage = new Stage();
        String title = "Login Form";
        HelloApplication.nav(myStage, "login.fxml", title.toUpperCase(), 600, 400);

    }

    @FXML
    void student(ActionEvent event) throws IOException {
        Stage myStage = new Stage();
        String title = "Student Details Form";
        HelloApplication.nav(myStage, "studentManagement.fxml", title.toUpperCase(), 600, 400);

    }

}
