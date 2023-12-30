package com.example.recipe_app;

import javafx.application.Application;
import javafx.stage.Stage;


public class RecipeManager extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // UI initialization
        primaryStage.setTitle("Recipe Manager");
        // Add your UI components here

        primaryStage.show();
    }

}
