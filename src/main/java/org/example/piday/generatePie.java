package org.example.piday;

import javafx.animation.ScaleTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class generatePie {




    public static Group Pie(){

        Circle circle = new Circle();
        circle.setRadius(HelloController.testProblem.radius);




        Group g = new Group();
        g.getChildren().addAll(circle);
        for (int i = 0; i < HelloController.testProblem.denominator; i++){

            Line slice = new Line();
            slice.setStartY(Math.cos((2* Math.PI * i)/HelloController.testProblem.denominator)*HelloController.testProblem.radius);
            slice.setStartX(Math.sin((2* Math.PI * i)/HelloController.testProblem.denominator)*HelloController.testProblem.radius);
            slice.setEndX(0);
            slice.setEndY(0);
            slice.setStroke(Color.WHITE);
            slice.setStrokeWidth(5);
            g.getChildren().add(slice);
        }


        return g;
    }

    public void takeBites (Group g){

        ScaleTransition scaleTransition = new ScaleTransition();

        //Setting the duration for the transition
        scaleTransition.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        scaleTransition.setNode(g);

        //Setting the dimensions for scaling
        scaleTransition.setByY(1.5);
        scaleTransition.setByX(1.5);

        //Setting the cycle count for the translation
        scaleTransition.setCycleCount(50);

        //Setting auto reverse value to true
        scaleTransition.setAutoReverse(false);

        //Playing the animation
        scaleTransition.play();
    }

    public ScaleTransition slicingAnimation (Group g) {

        ScaleTransition slicingAnimation = new ScaleTransition();

        slicingAnimation.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        slicingAnimation.setNode(g);

        //Setting the dimensions for scaling
        slicingAnimation.setByY(1.5);
        slicingAnimation.setByX(1.5);

        //Setting the cycle count for the translation
        slicingAnimation.setCycleCount(50);

        //Setting auto reverse value to true
        slicingAnimation.setAutoReverse(false);

        return slicingAnimation;

    }

}
