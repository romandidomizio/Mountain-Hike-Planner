package ooad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

/**
 * Provides the GUI for selecting a trail.
 */
public class TrailSelectionView {

    private TrailManager trailManager; // Access to the trail data
    private VBox view; // Vertical layout to organize UI components

    public TrailSelectionView(TrailManager trailManager) {
        this.trailManager = trailManager;
        this.view = new VBox();
        initializeView();
    }

    private void initializeView() {
        ObservableList<String> trailDetails = FXCollections.observableArrayList();
        // Populate the observable list with trail details
        trailManager.getTrails().forEach(trail -> trailDetails.add(
                String.format("%s - Distance: %.1f miles, Elevation: %d ft, Time: %.1f hrs",
                        trail.getName(), trail.getDistance(), trail.getElevationGain(), trail.getEstimatedTime())));

        ListView<String> listView = new ListView<>(trailDetails); // Create a ListView for displaying trails
        listView.setPrefHeight(550); // Set preferred height
        view.getChildren().add(listView); // Add ListView to the VBox
    }

    // Returns the VBox containing all UI elements
    public VBox getView() {
        return view;
    }
}
