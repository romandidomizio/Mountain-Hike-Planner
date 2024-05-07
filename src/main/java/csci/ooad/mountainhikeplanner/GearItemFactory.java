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
            case "sandwiches":
                return new GearItem("Sandwiches", "Food");
            case "first aid kit":
                return new GearItem("First Aid Kit", "Safety");
            case "day pack":
                return new GearItem("Day Pack", "Equipment");
            case "gps device":
                return new GearItem("GPS Device", "Navigation");
            case "hiking boots":
                return new GearItem("Hiking Boots", "Footwear");
            case "rain jacket":
                return new GearItem("Rain Jacket", "Clothing");
            case "emergency shelter":
                return new GearItem("Emergency Shelter", "Survival");
            case "satellite messenger":
                return new GearItem("Satellite Messenger", "Communication");
            case "ice axe":
                return new GearItem("Ice Axe", "Equipment");
            case "snow spikes":
                return new GearItem("Snow Spikes", "Equipment");
            case "tent":
                return new GearItem("Tent", "Equipment");
            case "bear spray":
                return new GearItem("Bear Spray", "Survival");
            case "thermal":
                return new GearItem("Thermal Blanket", "Survival");
            default:
                return new GearItem("Generic Gear", "Miscellaneous");
        }
    }
}