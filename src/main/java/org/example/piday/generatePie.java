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
        circle.setTranslateX(0);
        circle.setTranslateY(-200 - HelloController.testProblem.radius);
        circle.setRadius(HelloController.testProblem.radius);
        //jhhgukjbhvngc

        Line line = new Line();
        line.setStartX(0);
        line.setStartY(HelloController.testProblem.radius);
        line.setEndX(0);
        line.setEndY(0);

        line.setTranslateY(-50 - HelloController.testProblem.radius);

        // black for better testting
        line.setStroke(Color.BLACK);

        Group g = new Group();

        g.getChildren().addAll(line, circle);

        return g;
    }

}
