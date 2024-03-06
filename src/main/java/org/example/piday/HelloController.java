package org.example.piday;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Button button1;
    @FXML
    private Label welcomeText;

    static Problem testProblem = new Problem("ballsucker");
    @FXML
    protected void onHelloButtonClick() {


        welcomeText.setText("Circle with radius of " + testProblem.radius);
        button1.setText("Ok");
    }

    public static int getRadius(){
        return testProblem.radius;
    }


}