package org.example.piday;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Button button1;
    @FXML
    private Label welcomeText;



    public static int radius = generateProblem.generateRadius();
    @FXML
    protected void onHelloButtonClick() {


        welcomeText.setText("Circle with radius of " + radius);
        button1.setText("Ok");
    }

    public static int getRadius(){
        return radius;
    }


}