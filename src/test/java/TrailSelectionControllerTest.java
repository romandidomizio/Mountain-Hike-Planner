package csci.ooad;

import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.testfx.framework.junit5.ApplicationTest;

/**
 * Test class for TrailSelectionController using TestFX for JavaFX UI testing.
 */
public class TrailSelectionControllerTest extends ApplicationTest {
    private TrailSelectionController controller;

    @BeforeEach
    void setUp() {
        controller = new TrailSelectionController();
        // Manually populate the trail list for testing purposes
        controller.getTrails().add(new Trail("Test Trail", 15.0, 300.0, 4));
    }

    @Test
    void testSelectionUpdatesDetails() {
        ListView<Trail> listView = (ListView<Trail>) controller.getView().getChildren().get(0);
        clickOn(listView.getItems().get(0));
        Label detailsLabel = (Label) controller.getView().getChildren().get(1);

        assertTrue(detailsLabel.getText().contains("Test Trail"), "Details label should update with trail name");
    }
}
