package csci.ooad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

/**
 * Controller for managing the gear checklist interface.
 */
public class GearChecklistController {
    private ObservableList<String> checklistItems = FXCollections.observableArrayList();
    private VBox view = new VBox(10);

    public GearChecklistController() {
        initializeUI();
    }

    /**
     * Initializes the user interface for gear checklist management.
     */
    private void initializeUI() {
        ListView<String> checklistView = new ListView<>(checklistItems);
        checklistView.setEditable(true);

        // Text field and button for adding new items
        TextField newItemField = new TextField();
        newItemField.setPromptText("Add new item");
        Button addButton = new Button("Add");
        addButton.setOnAction(event -> addItem(newItemField.getText()));

        HBox inputArea = new HBox(10);
        inputArea.getChildren().addAll(newItemField, addButton);

        // Button for saving the checklist
        Button saveButton = new Button("Save Checklist");
        saveButton.setOnAction(event -> saveChecklist());

        view.getChildren().addAll(checklistView, inputArea, saveButton);
    }

    /**
     * Adds a new item to the checklist.
     * @param item the name of the item to add
     */
    private void addItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            checklistItems.add(item.trim());
        }
    }

    /**
     * Saves the current checklist. This method would interact with a data service to save the list.
     */
    private void saveChecklist() {
        // Implementation to save the checklist to a file or database
        System.out.println("Checklist saved: " + checklistItems);
    }

    /**
     * Generates a gear checklist based on the selected trail.
     * This could be extended to consider factors like trail difficulty and weather conditions.
     * @param trail the selected trail
     */
    public void generateChecklistForTrail(Trail trail) {
        checklistItems.clear(); // Clear existing items
        // Add basic items
        checklistItems.addAll("Water Bottle", "Map", "Compass");
        if (trail.getElevationGain() > 500) { // Assume units are in meters
            checklistItems.add("Hiking Poles");
        }
        if (trail.getEstimatedTime() > 5) { // Assume time in hours
            checklistItems.add("Headlamp");
            checklistItems.add("Extra Food");
        }
    }

    /**
     * Gets the view containing the checklist UI components.
     * @return the view as a VBox
     */
    public VBox getView() {
        return view;
    }
}
