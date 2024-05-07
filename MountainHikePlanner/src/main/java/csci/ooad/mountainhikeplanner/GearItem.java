package csci.ooad.mountainhikeplanner;

/**
 * Represents a gear item with a name and category.
 */
public class GearItem {
    private String name;
    private String category;

    public GearItem(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " (" + category + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GearItem gearItem = (GearItem) o;
        return name.equals(gearItem.name) && category.equals(gearItem.category);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, category);
    }
}