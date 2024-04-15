package csci.ooad;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import java.util.List;

/**
 * Test class for TrailDataService.
 */
public class TrailDataServiceTest {
    private TrailDataService trailDataService;
    private Trail trail;

    @BeforeEach
    void setUp() {
        // This setup assumes you are mocking the file operations
        trailDataService = Mockito.spy(new TrailDataService());
        Mockito.doNothing().when(trailDataService).saveTrails(); // Prevent actual file I/O
        trail = new Trail("Trail Name", 10.0, 500.0, 3);
    }

    @Test
    void testAddTrail() {
        trailDataService.addTrail(trail);
        List<Trail> trails = trailDataService.getTrails();
        assertTrue(trails.contains(trail), "Trail should be added to the list");
    }

    @Test
    void testRemoveTrail() {
        trailDataService.addTrail(trail);
        trailDataService.removeTrail(trail);
        List<Trail> trails = trailDataService.getTrails();
        assertFalse(trails.contains(trail), "Trail should be removed from the list");
    }

    @Test
    void testUpdateTrail() {
        Trail newTrail = new Trail("Updated Trail", 12.0, 550.0, 4);
        trailDataService.addTrail(trail);
        trailDataService.updateTrail(trail, newTrail);
        List<Trail> trails = trailDataService.getTrails();
        assertTrue(trails.contains(newTrail), "Trail should be updated in the list");
        assertFalse(trails.contains(trail), "Old trail should not be in the list");
    }
}
