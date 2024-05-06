package ooad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main application class that launches the JavaFX GUI.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TrailManager trailManager = new TrailManager(); // Manage trail data
        TrailSelectionView view = new TrailSelectionView(trailManager); // UI for trail selection

        Scene scene = new Scene(view.getView(), 800, 600); // Create scene with a specific size
        primaryStage.setTitle("Mountain Hike Planner"); // Set the title of the window
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
