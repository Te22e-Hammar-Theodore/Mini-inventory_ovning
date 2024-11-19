public class Consumable extends Item {
    // Attributes
    private int usesMax;
    private int usesCurrent = 0;

    //Consumable
    public Consumable(int usesMax, String name, float weight) {
        super(name, weight);
        this.usesMax = usesMax;
    }

    public void use(Character target) {
        if (usesCurrent < usesMax) {
            target.
            usesCurrent--;
        }
    }
}
