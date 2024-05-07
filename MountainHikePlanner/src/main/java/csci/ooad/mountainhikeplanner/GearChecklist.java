package csci.ooad.mountainhikeplanner;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a gear checklist that can be modified and observed.
 */
public class GearChecklist {
    private List<GearItem> items;
    private List<GearChecklistObserver> observers;

    public GearChecklist() {
        items = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addItem(GearItem item) {
        items.add(item);
        notifyObservers();
    }

    public void removeItem(GearItem item) {
        items.remove(item);
        notifyObservers();
    }

    private void notifyObservers() {
        for (GearChecklistObserver observer : observers) {
            observer.update();
        }
    }

    public void addObserver(GearChecklistObserver observer) {
        observers.add(observer);
    }

    public List<GearItem> getItems() {
        return items;
    }
}
