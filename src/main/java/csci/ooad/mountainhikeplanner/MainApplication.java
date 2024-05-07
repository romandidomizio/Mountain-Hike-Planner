package csci.ooad.mountainhikeplanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication extends Application {

    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML document for the trail selection interface
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/csci/ooad/mountainhikeplanner/TrailSelection.fxml"));
            Parent root = loader.load();

            // Set the scene with the loaded FXML layout
            Scene scene = new Scene(root, 800, 600);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Mountain Hike Planner");
            primaryStage.show();
        } catch (Exception e) {
            logger.error("Failed to load the Trail Selection Interface", e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

