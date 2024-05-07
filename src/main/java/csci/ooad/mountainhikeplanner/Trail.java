package csci.ooad.mountainhikeplanner;

/**
 * Represents a hiking trail with detailed attributes.
 * This class includes information about the trail's name, distance, route type,
 * elevation gain, starting elevation, estimated time to complete the trail,
 * location, and the recommended experience level for hikers.
 */
public class Trail {
    private String name;
    private double distance;
    private String routeType;
    private int elevationGain;
    private int startingElevation;
    private String estimatedTime;
    private String location;
    private String experienceLevel;

    public Trail() {
    }

    public Trail(String name, double distance, String routeType, int elevationGain, int startingElevation,
                 String estimatedTime, String location, String experienceLevel) {
        this.name = name;
        this.distance = distance;
        this.routeType = routeType;
        this.elevationGain = elevationGain;
        this.startingElevation = startingElevation;
        this.estimatedTime = estimatedTime;
        this.location = location;
        this.experienceLevel = experienceLevel;
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

    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public int getElevationGain() {
        return elevationGain;
    }

    public void setElevationGain(int elevationGain) {
        this.elevationGain = elevationGain;
    }

    public int getStartingElevation() {
        return startingElevation;
    }

    public void setStartingElevation(int startingElevation) {
        this.startingElevation = startingElevation;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    @Override
    public String toString() {
        return name + " - " + location;
    }
}
