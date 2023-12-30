module com.example.recipe_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.dlsc.formsfx;

    opens com.example.recipe_app to javafx.fxml;
    exports com.example.recipe_app;
}