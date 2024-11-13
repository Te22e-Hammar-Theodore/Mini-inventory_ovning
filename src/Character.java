import java.util.Scanner;

public class Character {
    public int usesCurrent;
    private int hp;
    private String name;
    public Inventory backpack;
    private boolean gameOver;
    Scanner sc = new Scanner(System.in);

    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
        this.backpack = new Inventory();
    }

    public void introduction() {
        System.out.println("Welcome to Mini-inventory");
        System.out.println("What is the name of the character?");
        System.out.print(">>> ");
        name = sc.nextLine();
        System.out.println();
        System.out.println("+---------------------------------+");
        System.out.println("|name: " + name + " | hp: " + hp + "|");
        System.out.println("+---------------------------------+");
        System.out.println();
        backpack.addItem(new Weapon("Kalle", 4.3f, 34, 100));
        backpack.addItem(new Consumable(1, "flowberry", 23));
        while (gameOver == false) {
            System.out.println("What do you want to do?");
            System.out.println("1. show backpack");
            System.out.println("2. pick a the helmet infront of you");
            System.out.println("3. end the game");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    backpack.display();
                    break;

                case 2:
                    Armor.pickUpHelmet(sc, backpack);
                    break;

                case 3:
                    System.out.println("The game is ending");
                    gameOver = true;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }


}
