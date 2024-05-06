package ooad;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a hiking trail.
 */
public class Trail {
    @JsonProperty("name")
    private String name;
    @JsonProperty("distance")
    private double distance; // in miles
    @JsonProperty("elevationGain")
    private int elevationGain; // in feet
    @JsonProperty("estimatedTime")
    private double estimatedTime; // in hours

    // Default constructor for JSON deserialization
    public Trail() {
    }

    public Trail(String name, double distance, int elevationGain, double estimatedTime) {
        this.name = name;
        this.distance = distance;
        this.elevationGain = elevationGain;
        this.estimatedTime = estimatedTime;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getElevationGain() {
        return elevationGain;
    }

    public void setElevationGain(int elevationGain) {
        this.elevationGain = elevationGain;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "Trail{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", elevationGain=" + elevationGain +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
}
