package csci.ooad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main application class that launches the GUI.
 * This class extends Application, which is the base class for JavaFX applications.
 */
public class Main extends Application {

    /**
     * The start method is the main entry point for all JavaFX applications.
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set.
     */
    @Override
    public void start(Stage primaryStage) {
        // Create a VBox layout manager with spacing between components
        VBox root = new VBox();
        root.setSpacing(10);

        // Create a scene with the VBox as the root node, with a width of 800px and height of 600px
        Scene scene = new Scene(root, 800, 600);

        // Set the title of the stage (window)
        primaryStage.setTitle("Mountain Hike Planner");
        // Set the scene to the stage
        primaryStage.setScene(scene);
        // Show the stage to the user
        primaryStage.show();
    }

    /**
     * The main method only needs to call the launch method,
     * which will launch the JavaFX application.
     * @param args command-line arguments passed to the application.
     * Not used in this simple example.
     */
    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
