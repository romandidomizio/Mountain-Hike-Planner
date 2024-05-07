package csci.ooad.mountainhikeplanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class TrailSelectionController {
    @FXML
    private ListView<Trail> listViewTrails;
    @FXML
    private TextArea textAreaDetail;

    private TrailDataManager trailDataManager;
    private ObservableList<Trail> observableTrails;

    public void initialize() {
        trailDataManager = new TrailDataManager();
        observableTrails = FXCollections.observableArrayList(trailDataManager.loadTrails());
        listViewTrails.setItems(observableTrails);

        listViewTrails.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                displayTrailDetails(newSelection);
            }
        });
    }

    private void displayTrailDetails(Trail trail) {
        String detail = String.format("Name: %s\nLocation: %s\nDistance: %.2f miles\nRoute Type: %s\nElevation Gain: %d feet\nStarting Elevation: %d feet\nEstimated Time: %s\nExperience Level: %s",
                trail.getName(), trail.getLocation(), trail.getDistance(), trail.getRouteType(),
                trail.getElevationGain(), trail.getStartingElevation(), trail.getEstimatedTime(),
                trail.getExperienceLevel());
        textAreaDetail.setText(detail);
    }
}
