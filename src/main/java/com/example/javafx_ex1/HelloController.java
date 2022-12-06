package com.example.javafx_ex1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField fxusername;
    @FXML
    private TextField fxpassword;
    @FXML
    public void click(ActionEvent e) {
        String username = fxusername.getText();
        String password = fxpassword.getText();
        System.out.println(username);
        System.out.println(password);
    }
}