import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();


    public void display() {
        for (Item item : items) {
            item.displayItem();
            System.out.println();
        }
    }

    public void addItem(Item item) {
        items.add(item);
        item.displayItem();

    }


}
