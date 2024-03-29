package org.example.piday;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.math.BigDecimal;
import java.math.MathContext;


public class HelloController {
    @FXML
    public Button button1;
    @FXML
    public TextField fieldAnswer;
    @FXML
    public Label errorValue;
    @FXML
    private Label welcomeText;
    @FXML
    private VBox vBox;
    public int biteCount;

    static Problem testProblem = new Problem("");
    @FXML
    protected void onButton1Click() {

        testProblem = new Problem("newProblem");
        welcomeText.setText("Circumference of pi(e) with radius of " + testProblem.radius + " where someone ate 1/" + testProblem.denominator +" of it");
        button1.setText("New Question");
        biteCount = 0;
        errorValue.setText("");
        fieldAnswer.setText("");

    }




    public static int getRadius(){
        return testProblem.radius;
    }


    public Group generatePie() {

        return generatePie.Pie();
    }


    public void submitClicked() {
        int integerPlaces = fieldAnswer.getText().indexOf(".");
        int decimalPlaces =   integerPlaces > 0 ? fieldAnswer.getLength() - integerPlaces:
                                1;
        MathContext precision = new MathContext((decimalPlaces + 1));
        BigDecimal error = null;

        try {
            error = testProblem.answer().subtract(new BigDecimal(fieldAnswer.getText())).round(precision);
        } catch (Exception e){
            errorValue.setText("Please input a number");
        }

        errorValue.setText("FALSE: You are off by: " + error.toString());


    }
}