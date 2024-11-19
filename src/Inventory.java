import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

// Dispolay method
    public void display() {
        for (Item item : items) {
            item.displayItem();
            System.out.println();
        }
    }
// Method for adding items
    public void addItem(Item item) {
        items.add(item);
        item.displayItem();

    }


}
