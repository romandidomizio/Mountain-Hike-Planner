package csci.ooad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Trail.
 */
public class TrailTest {
    @Test
    void testTrailSettersAndGetters() {
        Trail trail = new Trail();
        trail.setName("Rocky Trail");
        trail.setDistance(20.0);
        trail.setElevationGain(750.0);
        trail.setEstimatedTime(5);

        assertAll("trail",
                () -> assertEquals("Rocky Trail", trail.getName()),
                () -> assertEquals(20.0, trail.getDistance()),
                () -> assertEquals(750.0, trail.getElevationGain()),
                () -> assertEquals(5, trail.getEstimatedTime())
        );
    }
}
