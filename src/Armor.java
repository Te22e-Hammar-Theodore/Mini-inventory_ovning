import java.util.Scanner;

public class Armor extends Item {
    private float protection;

    public Armor(float protection, String name, float weight) {
        super(name, weight);
        this.protection = protection;

    }

    public static void pickUpHelmet(Scanner sc, Inventory backpack) {
        System.out.println("Infront of you lies a helmet, do you wish to pick it up? (y/n)");
        System.out.print(">>> ");
        String helmetChoice = sc.nextLine();
        if (helmetChoice.equalsIgnoreCase("y")) {
            backpack.addItem(new Armor(1, "helmet of rizz", 5.2F));
        }
    }


}
