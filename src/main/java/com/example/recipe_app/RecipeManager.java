package com.example.recipe_app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class RecipeManager {
    private ObservableList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = FXCollections.observableArrayList();
    }

    // Other methods for managing recipes and categories

    public ObservableList<Recipe> getRecipes() {
        return recipes;
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void editRecipe(Recipe recipe) {
        // Implement edit logic
    }

    public void deleteRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    // Other methods...

    // For testing purposes, you can add some sample recipes
    public void addSampleRecipes() {
        Recipe recipe1 = new Recipe("Sample Recipe 1",
                new ArrayList<>(List.of("Ingredient 1", "Ingredient 2")),
                "Instructions for sample recipe 1", 30, 4, "Notes for sample recipe 1", "Sample Category");

        Recipe recipe2 = new Recipe("Sample Recipe 2",
                new ArrayList<>(List.of("Ingredient A", "Ingredient B")),
                "Instructions for sample recipe 2", 20, 3, "Notes for sample recipe 2", "Sample Category");

        recipes.addAll(recipe1, recipe2);
    }
}
