package ooad;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages the trail data.
 */
public class TrailManager {
    private List<Trail> trails;
    private ObjectMapper objectMapper;

    public TrailManager() {
        this.trails = new ArrayList<>();
        this.objectMapper = new ObjectMapper();
        loadTrails();
    }

    // Loads trails from a JSON file
    private void loadTrails() {
        try {
            File file = new File("src/main/resources/trails.json");
            CollectionType javaType = objectMapper.getTypeFactory()
                    .constructCollectionType(List.class, Trail.class);
            trails = objectMapper.readValue(file, javaType);
        } catch (IOException e) {
            System.err.println("Error loading trails: " + e.getMessage());
        }
    }

    // Returns the list of trails
    public List<Trail> getTrails() {
        return trails;
    }

    // Example usage of the TrailManager class
    public static void main(String[] args) {
        TrailManager manager = new TrailManager();
        manager.getTrails().forEach(System.out::println);
    }
}
