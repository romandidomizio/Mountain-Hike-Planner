package csci.ooad.mountainhikeplanner;

import java.util.ArrayList;
import java.util.List;

public interface GearStrategy {
    List<GearItem> recommendGear();
}

class BasicGearStrategy implements GearStrategy {
    @Override
    public List<GearItem> recommendGear() {
        List<GearItem> items = new ArrayList<>();
        items.add(new GearItem("Water Bottle", "Essentials"));
        items.add(new GearItem("First Aid Kit", "Safety"));
        items.add(new GearItem("Trail Snacks", "Food"));
        return items;
    }
}

class AdvancedGearStrategy implements GearStrategy {
    @Override
    public List<GearItem> recommendGear() {
        List<GearItem> items = new ArrayList<>();
        items.add(new GearItem("Water Bottle", "Essentials"));
        items.add(new GearItem("GPS Device", "Navigation"));
        items.add(new GearItem("Hiking Boots", "Footwear"));
        items.add(new GearItem("Sandwiches", "Food"));
        return items;
    }
}

class ExpertGearStrategy implements GearStrategy {
    @Override
    public List<GearItem> recommendGear() {
        List<GearItem> items = new ArrayList<>();
        items.add(new GearItem("Day Pack", "Equipment"));
        items.add(new GearItem("Emergency Shelter", "Survival"));
        items.add(new GearItem("Satellite Messenger", "Communication"));
        items.add(new GearItem("Snow Spikes", "Equipment"));
        return items;
    }
}
