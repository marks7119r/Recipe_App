package com.example.recipe_app;

import javafx.beans.property.*;
import java.util.List;
import javafx.collections.FXCollections;


public class Recipe {
    private StringProperty title = new SimpleStringProperty();
    private StringProperty instructions = new SimpleStringProperty();
    private IntegerProperty cookingTime = new SimpleIntegerProperty();
    private IntegerProperty servingSize = new SimpleIntegerProperty();
    private StringProperty notes = new SimpleStringProperty();
    private StringProperty category = new SimpleStringProperty();

    private ListProperty<String> ingredients = new SimpleListProperty<>();

    // Constructors, getters, setters

    public Recipe(String title, List<String> ingredients, String instructions, int cookingTime, int servingSize, String notes, String category) {
        this.title.set(title);
        this.ingredients.set(FXCollections.observableArrayList(ingredients));
        this.instructions.set(instructions);
        this.cookingTime.set(cookingTime);
        this.servingSize.set(servingSize);
        this.notes.set(notes);
        this.category.set(category);
    }

    // Getters for JavaFX properties
    public StringProperty titleProperty() {
        return title;
    }

    public ListProperty<String> ingredientsProperty() {
        return ingredients;
    }

    public StringProperty instructionsProperty() {
        return instructions;
    }

    public IntegerProperty cookingTimeProperty() {
        return cookingTime;
    }

    public IntegerProperty servingSizeProperty() {
        return servingSize;
    }

    public StringProperty notesProperty() {
        return notes;
    }

    public StringProperty categoryProperty() {
        return category;
    }

    // Other methods...

    public String getTitle() {
        return title.get();
    }

    public List<String> getIngredients() {
        return ingredients.get();
    }

    public String getInstructions() {
        return instructions.get();
    }

    public int getCookingTime() {
        return cookingTime.get();
    }

    public int getServingSize() {
        return servingSize.get();
    }

    public String getNotes() {
        return notes.get();
    }

    public String getCategory() {
        return category.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients.set(FXCollections.observableArrayList(ingredients));
    }

    public void setInstructions(String instructions) {
        this.instructions.set(instructions);
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime.set(cookingTime);
    }

    public void setServingSize(int servingSize) {
        this.servingSize.set(servingSize);
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    public void setCategory(String category) {
        this.category.set(category);
    }
}
