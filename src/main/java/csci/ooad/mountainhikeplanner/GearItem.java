package csci.ooad.mountainhikeplanner;

public class GearItem {
    private String name;
    private String category; // e.g., Clothing, Equipment

    public GearItem(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

