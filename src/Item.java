public class Item {
    protected String name;
    protected float weight;
    protected String itemType;

    public Item(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public void displayItem() {

        if (getClass() == Weapon.class) {
            itemType = "Weapon";
        } else if (getClass() == Armor.class) {
            itemType = "Armor";
        } else {
            itemType = "Consumable";
        }

        System.out.println(itemType + ": " + this.name + " | weight: " + this.weight + " kg");

    }


}
