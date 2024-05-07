package csci.ooad.mountainhikeplanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrailDataManager {
    private static final String TRAIL_DATA_PATH = "src/main/resources/csci/ooad/mountainhikeplanner/trails.json";
    private final ObjectMapper objectMapper;
    private static final Logger logger = LoggerFactory.getLogger(TrailDataManager.class);

    public TrailDataManager() {
        objectMapper = new ObjectMapper();
    }

    /**
     * Loads the trail data from a JSON file.
     * @return a list of Trail objects
     */
    public List<Trail> loadTrails() {
        try {
            File file = new File(TRAIL_DATA_PATH);
            List<Trail> trails = objectMapper.readValue(file, new TypeReference<List<Trail>>(){});
            logger.info("Loaded {} trails from {}", trails.size(), file.getAbsolutePath());
            return trails;
        } catch (IOException e) {
            logger.error("Failed to load trails from {}", TRAIL_DATA_PATH, e);
            return new ArrayList<>(); // Return an empty list in case of failure
        }
    }

    /**
     * Saves the trail data to a JSON file.
     * @param trails List of Trail objects to be saved
     */
    public void saveTrails(List<Trail> trails) {
        try {
            File file = new File(TRAIL_DATA_PATH);
            objectMapper.writeValue(file, trails);
            logger.info("Saved {} trails to {}", trails.size(), file.getAbsolutePath());
        } catch (IOException e) {
            logger.error("Failed to save trails to {}", TRAIL_DATA_PATH, e);
        }
    }
}
