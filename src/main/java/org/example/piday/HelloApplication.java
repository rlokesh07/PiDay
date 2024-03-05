package org.example.piday;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));



        int radius = HelloController.getRadius();
        Circle circle = new Circle();
        circle.setTranslateX(0);
        circle.setTranslateY(-50 - radius);gi
        circle.setRadius(radius);
        //jhhgukjbhvngc


        StackPane root = new StackPane();
        root.getChildren().addAll(fxmlLoader.load(), circle); // Add both FXML content and circle to the StackPane

        Scene scene = new Scene(root, 300, 240);



        stage.setTitle("BLACK!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}