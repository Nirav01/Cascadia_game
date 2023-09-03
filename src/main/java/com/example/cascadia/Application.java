package com.example.cascadia;

import com.example.cascadia.board.World;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new World());
        stage.setTitle("Cascadia");
        stage.setScene(scene);
        stage.setHeight(500);
        stage.setWidth(500);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}























