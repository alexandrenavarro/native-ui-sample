package com.github.alexandrenavarro.ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxMain extends Application {

    public void start(Stage stage) {
        long start = System.currentTimeMillis();
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        VBox root = new VBox(30, label);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        long stop = System.currentTimeMillis();
        System.out.println("Launched in " + (stop - start) + " ms.");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
