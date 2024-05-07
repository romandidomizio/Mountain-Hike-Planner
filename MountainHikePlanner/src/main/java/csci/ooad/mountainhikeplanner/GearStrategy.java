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
        items.add(new GearItem("Trail Snacks", "Food"));
        items.add(new GearItem("First Aid Kit", "Safety"));
        return items;
    }
}

class AdvancedGearStrategy implements GearStrategy {
    @Override
    public List<GearItem> recommendGear() {
        List<GearItem> items = new ArrayList<>();
        items.add(new GearItem("GPS Device", "Navigation"));
        items.add(new GearItem("Technical Hiking Boots", "Footwear"));
        items.add(new GearItem("Rain Jacket", "Clothing"));
        return items;
    }
}

class ExpertGearStrategy implements GearStrategy {
    @Override
    public List<GearItem> recommendGear() {
        List<GearItem> items = new ArrayList<>();
        items.add(new GearItem("Emergency Shelter", "Survival"));
        items.add(new GearItem("Satellite Messenger", "Communication"));
        items.add(new GearItem("Ice Axe", "Equipment"));
        return items;
    }
}
