package com.example.recipe_app;

import javafx.application.Application;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create your JavaFX user interface here
        // You can use FXML for the UI or create it programmatically

        primaryStage.setTitle("Recipe Manager");
        // Add your UI components here

        primaryStage.show();
    }
}