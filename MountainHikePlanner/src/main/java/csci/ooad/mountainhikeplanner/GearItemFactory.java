package csci.ooad.mountainhikeplanner;

/**
 * Factory for creating gear items.
 */
public class GearItemFactory {
    public GearItem createGearItem(String type) {
        switch (type.toLowerCase()) {
            case "water bottle":
                return new GearItem("Water Bottle", "Essentials");
            case "trail snacks":
                return new GearItem("Trail Snacks", "Food");
            case "first aid kit":
                return new GearItem("First Aid Kit", "Safety");
            case "gps device":
                return new GearItem("GPS Device", "Navigation");
            case "hiking boots":
                return new GearItem("Technical Hiking Boots", "Footwear");
            case "rain jacket":
                return new GearItem("Rain Jacket", "Clothing");
            case "emergency shelter":
                return new GearItem("Emergency Shelter", "Survival");
            case "satellite messenger":
                return new GearItem("Satellite Messenger", "Communication");
            case "ice axe":
                return new GearItem("Ice Axe", "Equipment");
            case "thermal":
                return new GearItem("Thermal Blanket", "Survival");
            default:
                return new GearItem("Generic Gear", "Miscellaneous");
        }
    }
}