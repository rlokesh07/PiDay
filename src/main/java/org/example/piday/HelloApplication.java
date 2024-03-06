package org.example.piday;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.*;

public class HelloApplication extends Application {

    @FXML

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = fxmlLoader.load();



        Button button1 = (Button) root.lookup("#button1");
        button1.setOnMouseClicked(mouseEvent -> {
            HelloController controller = fxmlLoader.getController();
            Group g = controller.generatePie();
            g.setTranslateY(-50);
            root.getChildren().set(0, g);
        });


        Scene scene = new Scene(root, 300, 240);
        stage.setTitle("PI!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}