package com.example.recipe_app;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class RecipeApp extends Application {

    private RecipeManager recipeManager;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        recipeManager = new RecipeManager();

        // Adding sample recipes
        recipeManager.addRecipe(new Recipe("Spaghetti Bolognese",
                Arrays.asList("Spaghetti", "Ground beef", "Tomato sauce"),
                "Cook spaghetti. Brown beef. Mix with sauce.", 30, 4, "Classic Italian dish", "Pasta"));

        recipeManager.addRecipe(new Recipe("Caesar Salad",
                Arrays.asList("Romaine lettuce", "Croutons", "Parmesan", "Chicken", "Caesar dressing"),
                "Chop lettuce. Grill chicken. Toss all ingredients.", 20, 2, "Healthy and delicious", "Salad"));

        primaryStage.setTitle("Recipe App");

        ListView<Recipe> recipeListView = createRecipeListView();

        Button addRecipeButton = createStyledButton("Add Recipe");
        addRecipeButton.setOnAction(e -> showAddRecipeDialog());

        Button editRecipeButton = createStyledButton("Edit Recipe");
        editRecipeButton.setOnAction(e -> showEditRecipeDialog(recipeListView.getSelectionModel().getSelectedItem()));

        Button deleteRecipeButton = createStyledButton("Delete Recipe");
        deleteRecipeButton.setOnAction(e -> deleteSelectedRecipe(recipeListView));

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(addRecipeButton, editRecipeButton, deleteRecipeButton);

        BorderPane layout = new BorderPane();
        layout.setTop(buttonBox);
        layout.setCenter(recipeListView);

        Scene scene = new Scene(layout, 600, 400);
        scene.getStylesheets().add("file:///Users/marksafwat/IdeaProjects/RECIPE_APP/src/main/java/com/example/recipe_app/styles.css");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private ListView<Recipe> createRecipeListView() {
        ListView<Recipe> listView = new ListView<>();
        listView.setItems(recipeManager.getRecipes());

        // Set up a cell factory to customize how each item is displayed in the ListView
        listView.setCellFactory(param -> new ListCell<Recipe>() {
            @Override
            protected void updateItem(Recipe recipe, boolean empty) {
                super.updateItem(recipe, empty);

                if (empty || recipe == null) {
                    setText(null);
                } else {
                    setText(recipe.getTitle());
                }
            }
        });

        return listView;
    }

    private void showAddRecipeDialog() {
        // Implement the logic to show a dialog for adding a recipe
        // Call recipeManager.addRecipe(...) to add the recipe to the list and update the database
    }

    private void showEditRecipeDialog(Recipe selectedRecipe) {
        if (selectedRecipe != null) {
            // Implement the logic to show a dialog for editing a recipe
            // Call recipeManager.editRecipe(...) to edit the recipe in the list and update the database
        } else {
            // Show an alert indicating no recipe is selected
            showAlert("No Recipe Selected", "Please select a recipe to edit.");
        }
    }

    private void deleteSelectedRecipe(ListView<Recipe> recipeListView) {
        Recipe selectedRecipe = recipeListView.getSelectionModel().getSelectedItem();
        if (selectedRecipe != null) {
            // Implement the logic to delete the selected recipe
            // Call recipeManager.deleteRecipe(...) to delete the recipe from the list and update the database
        } else {
            // Show an alert indicating no recipe is selected
            showAlert("No Recipe Selected", "Please select a recipe to delete.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private Button createStyledButton(String buttonText) {
        Button button = new Button(buttonText);
        button.getStyleClass().add("styled-button");
        return button;
    }
}
