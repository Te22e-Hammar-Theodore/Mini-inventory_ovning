import java.util.Scanner;

public class Armor extends Item {
    // Attribute
    private float protection;

    //Constructor
    public Armor(float protection, String name, float weight) {
        super(name, weight);
        this.protection = protection;

    }
// Method for picking up the helmet
    public static void pickUpHelmet(Scanner sc, Inventory backpack) {
        System.out.println("Infront of you lies a helmet, do you wish to pick it up? (y/n)");
        System.out.print(">>> ");
        String helmetChoice = sc.nextLine();
        if (helmetChoice.equalsIgnoreCase("y")) {
            backpack.addItem(new Armor(1, "helmet of rizz", 5.2F));
        } else if (helmetChoice.equalsIgnoreCase("n")) {
            System.out.println("You chose to not pick up the hemlet");
        } else {
            System.out.println("Faulty inout, try again");
        }
    }


}
