package csci.ooad;

import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;

/**
 * Controller for the trail selection UI.
 */
public class TrailSelectionController {
    private TrailDataService trailDataService = new TrailDataService();
    private VBox view = new VBox();

    public TrailSelectionController() {
        initializeUI();
    }

    /**
     * Initializes the user interface for trail selection.
     */
    private void initializeUI() {
        ListView<Trail> trailListView = new ListView<>();
        trailListView.setItems(FXCollections.observableArrayList(trailDataService.getTrails()));
        trailListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                updateDetails(newVal);
            }
        });

        Label detailsLabel = new Label("Select a trail to see details.");
        view.getChildren().addAll(trailListView, detailsLabel);
    }

    /**
     * Updates the details label with information about the selected trail.
     */
    private void updateDetails(Trail trail) {
        String detailsText = String.format("Name: %s\nDistance: %.2f km\nElevation Gain: %.2f m\nEstimated Time: %d hrs",
                trail.getName(), trail.getDistance(), trail.getElevationGain(), trail.getEstimatedTime());
        ((Label) view.getChildren().get(1)).setText(detailsText);
    }

    public VBox getView() {
        return view;
    }
}
