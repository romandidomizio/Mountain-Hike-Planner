package csci.ooad.mountainhikeplanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import java.util.List;

public class TrailSelectionController implements GearChecklistObserver {
    @FXML
    private ListView<Trail> listViewTrails;
    @FXML
    private TextArea textAreaDetail;
    @FXML
    private ListView<String> listViewGearChecklist;
    @FXML
    private ComboBox<String> gearTypeComboBox;

    private TrailDataManager trailDataManager;
    private ObservableList<Trail> observableTrails;
    private GearChecklist gearChecklist;

    public void initialize() {
        trailDataManager = TrailDataManager.getInstance();
        observableTrails = FXCollections.observableArrayList(trailDataManager.loadTrails());
        listViewTrails.setItems(observableTrails);
        gearChecklist = new GearChecklist();
        gearChecklist.addObserver(this);
        gearTypeComboBox.setItems(FXCollections.observableArrayList(
                "Water Bottle", "Trail Snacks", "Sandwiches", "First Aid Kit", "Day Pack", "GPS Device",
                "Hiking Boots", "Rain Jacket", "Snow Spikes", "Tent", "Emergency Shelter", "Satellite Messenger",
                "Ice Axe", "Bear Spray", "Thermal Blanket"));

        listViewTrails.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                displayTrailDetails(newSelection);
                updateGearChecklist(newSelection);
            }
        });
    }

    private void displayTrailDetails(Trail trail) {
        String detail = String.format(
                "Name: %s\n" +
                        "Distance: %.2f miles\n" +
                        "Route Type: %s\n" +
                        "Elevation Gain: %d feet\n" +
                        "Starting Elevation: %d feet\n" +
                        "Estimated Time: %s\n" +
                        "Location: %s\n" +
                        "Experience Level: %s",
                trail.getName(),
                trail.getDistance(),
                trail.getRouteType(),
                trail.getElevationGain(),
                trail.getStartingElevation(),
                trail.getEstimatedTime(),
                trail.getLocation(),
                trail.getExperienceLevel()
        );
        textAreaDetail.setText(detail);
    }

    private void updateGearChecklist(Trail trail) {
        gearChecklist.getItems().clear(); // Clear existing items
        GearStrategy strategy = determineStrategy(trail.getExperienceLevel());
        List<GearItem> recommendedItems = strategy.recommendGear();
        for (GearItem item : recommendedItems) {
            gearChecklist.addItem(item);
        }
    }

    private GearStrategy determineStrategy(String level) {
        switch (level.toLowerCase()) {
            case "advanced":
                return new AdvancedGearStrategy();
            case "expert":
                return new ExpertGearStrategy();
            default:
                return new BasicGearStrategy();
        }
    }

    @Override
    public void update() {
        ObservableList<String> gearItems = FXCollections.observableArrayList();
        for (GearItem item : gearChecklist.getItems()) {
            gearItems.add(item.toString());
        }
        listViewGearChecklist.setItems(gearItems);
    }

    @FXML
    public void handleAddItem() {
        if (gearTypeComboBox.getValue() != null) {
            GearItemFactory factory = new GearItemFactory();
            gearChecklist.addItem(factory.createGearItem(gearTypeComboBox.getValue()));
        }
    }

    @FXML
    public void handleRemoveItem() {
        String selectedItem = listViewGearChecklist.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            String itemName = selectedItem.split(" \\(")[0];
            String itemCategory = selectedItem.substring(selectedItem.indexOf("(") + 1, selectedItem.length() - 1);
            gearChecklist.removeItem(new GearItem(itemName, itemCategory));
        }
    }
}
