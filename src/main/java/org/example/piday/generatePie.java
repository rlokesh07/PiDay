package org.example.piday;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class generatePie {

    int denominator;
    public generatePie(int denominator){
        this.denominator = denominator;
    }

    public Group Pie (){

        Circle circle = new Circle();
        circle.setRadius(HelloController.testProblem.radius);
        //jhhgukjbhvngc



        // black for better testting


        Group g = new Group();

        g.getChildren().addAll(circle);
        for (int i = 0; i < HelloController.testProblem.denominator; i++){

            Line slice = new Line();
            slice.setStartY(Math.cos((2* Math.PI * i)/denominator)*HelloController.testProblem.radius);
            slice.setStartX(Math.sin((2* Math.PI * i)/denominator)*HelloController.testProblem.radius);
            slice.setEndX(0);
            slice.setEndY(0);
            slice.setStroke(Color.WHITE);
            g.getChildren().add(slice);
        }





        return g;
    }

}
