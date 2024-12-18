import java.util.Random;

public class Weapon extends Item {
    //Attributes
    private Random rand = new Random();
    private float minDamage = 3;
    private float maxDamage = 10;

    // Constructor
    public Weapon(String name, float weight, float minDamage, float maxDamage) {
        super(name, weight);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public float attack() {
        return rand.nextFloat(minDamage, maxDamage);
    }
}
