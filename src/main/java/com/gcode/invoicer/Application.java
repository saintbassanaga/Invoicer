package com.gcode.invoicer;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("invoicer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 525);
        stage.setTitle("Invoicer");
        stage.setMaxWidth(700);
        stage.setMaxHeight(550);
        //stage.getIcons().add(new Image("@img/icon.png"));
        stage.getIcons().add(new Image(Objects.requireNonNull(Application.class.getResourceAsStream("@img/"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}