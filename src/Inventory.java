import java.util.ArrayList;

public class Inventory {

    private ArrayList<ClothingItem> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(ClothingItem item) {
        items.add(item);
    }

    public boolean removeItem(String name) {
        for (ClothingItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public ClothingItem findItemByName(String name) {
        for (ClothingItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public void listItems() {
        for (ClothingItem item : items) {
            System.out.println(item);
        }
    }
}
