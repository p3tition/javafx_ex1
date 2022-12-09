package com.example.javafx_ex1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private TextField fxusername;
    @FXML
    private TextField fxpassword;
    @FXML
    private TextField fxbutton_login;
    @Override
    public void Initialize(URL location, ResourceBundle resources){
        fxbutton_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
    }

    public void setUserInformation(String username){
        fxusername.setText("Welcome" + username + "!");
    }
}