package csci.ooad;

/**
 * Represents a hiking trail with properties like name, distance, elevation gain, and time.
 */
public class Trail {
    private String name;
    private double distance; // in kilometers
    private double elevationGain; // in meters
    private int estimatedTime; // in hours

    // Constructors
    public Trail() {
    }

    public Trail(String name, double distance, double elevationGain, int estimatedTime) {
        this.name = name;
        this.distance = distance;
        this.elevationGain = elevationGain;
        this.estimatedTime = estimatedTime;
    }

    // Getter and setter methods
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

    public double getElevationGain() {
        return elevationGain;
    }

    public void setElevationGain(double elevationGain) {
        this.elevationGain = elevationGain;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
