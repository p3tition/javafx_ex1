package com.example.javafx_ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
// #8B00FF
import java.io.IOException;

public class Application_main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application_main.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 400);
        stage.setTitle("p3tition foundation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}