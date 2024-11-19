public class Item {
    //Attributes
    protected String name;
    protected float weight;
    protected String itemType;

    // COnstructor
    public Item(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    // Method for recognizing which class an item is
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
