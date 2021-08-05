package com.example.javafx_course;

import javafx.application.Application;
import javafx.scene.Group; // Group (or root) is all the different elements inside of a scene
import javafx.scene.Scene; // A scene is "inside" a stage and stores all the roots (elements)
import javafx.stage.Stage; // Stage is the "window" of the program itself
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLANCHEDALMOND);

        // Name of "window" tab and added icon to the program (doesn't work)
        stage.setTitle("JavaFX Course Demo");
        Image icon = new Image(getClass().getResourceAsStream("/java-logo.png"));
        stage.getIcons().add(icon);

        // Size of stage
        stage.setWidth(600);
        stage.setHeight(500);

        // Add text to the Group root
        Text text = new Text();
        text.setText("Hey there!");
        text.setX(185);
        text.setY(70);
        text.setFont(Font.font("Lato", 50));
        text.setFill(Color.DARKRED);

        root.getChildren().add(text);

        // Add line to the Group root
        Line line = new Line();
        line.setStartX(130);
        line.setStartY(90);
        line.setEndX(450);
        line.setEndY(90);
        line.setStrokeWidth(2);

        root.getChildren().add(line);

        // Add rectangle to the Group root
        Rectangle rectangle = new Rectangle();
        rectangle.setX(290);
        rectangle.setY(170);
        rectangle.setHeight(80);
        rectangle.setWidth(80);
        rectangle.setFill(Color.PALEVIOLETRED);

        root.getChildren().add(rectangle);

        // Add triangle (need to be made as polygon)
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
        );
        triangle.setFill(Color.DARKSEAGREEN);

        root.getChildren().add(triangle);

        // Add circle to the Group root
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.DARKORANGE);

        root.getChildren().add(circle);

        // Add image to scene (doesn't work for some reason?)
        Image image = new Image(getClass().getResourceAsStream("/java_logo.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(150);
        imageView.setY(335);

        root.getChildren().add(imageView);

        // These methods should always be at the end of the start-method
        stage.setScene(scene);
        stage.show();
    }
}