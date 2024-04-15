package csci.ooad;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles data operations for trails, including loading from and saving to JSON.
 */
public class TrailDataService {
    private String dataFilePath = "trails.json"; // Path to the JSON file
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<Trail> trails;

    public TrailDataService() {
        loadTrails();
    }

    /**
     * Loads trails from a JSON file.
     */
    private void loadTrails() {
        try {
            trails = objectMapper.readValue(new File(dataFilePath), new TypeReference<List<Trail>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            trails = new ArrayList<>(); // Initialize with an empty list if there is an error
        }
    }

    /**
     * Saves the current list of trails back to the JSON file.
     */
    public void saveTrails() {
        try {
            objectMapper.writeValue(new File(dataFilePath), trails);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a new trail to the list.
     * @param trail The trail to add.
     */
    public void addTrail(Trail trail) {
        if (trail != null) {
            trails.add(trail);
            saveTrails(); // Save updated list to JSON
        }
    }

    /**
     * Removes a trail from the list.
     * @param trail The trail to remove.
     */
    public void removeTrail(Trail trail) {
        if (trails.remove(trail)) {
            saveTrails(); // Save updated list to JSON
        }
    }

    /**
     * Updates an existing trail.
     * @param oldTrail The existing trail to replace.
     * @param newTrail The new trail data.
     */
    public void updateTrail(Trail oldTrail, Trail newTrail) {
        int index = trails.indexOf(oldTrail);
        if (index != -1) {
            trails.set(index, newTrail);
            saveTrails(); // Save updated list to JSON
        }
    }

    public List<Trail> getTrails() {
        return trails;
    }
}
