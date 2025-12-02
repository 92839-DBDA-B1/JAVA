import java.util.Scanner;

// Abstract Fruit class
abstract class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Fruit(String name, double weight, String color, boolean isFresh) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = isFresh;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Color=" + color + ", Weight=" + weight;
    }

    public abstract String taste();
}

// Apple class
class Apple extends Fruit {
    public Apple(String name, double weight, String color, boolean isFresh) {
        super(name, weight, color, isFresh);
    }

    @Override
    public String taste() {
        return "sweet and sour";
    }
}

// Mango class
class Mango extends Fruit {
    public Mango(String name, double weight, String color, boolean isFresh) {
        super(name, weight, color, isFresh);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}

// Orange class
class Orange extends Fruit {
    public Orange(String name, double weight, String color, boolean isFresh) {
        super(name, weight, color, isFresh);
    }

    @Override
    public String taste() {
        return "sour";
    }
}

// Main class (FruitBasket)
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();

        Fruit[] basket = new Fruit[size];
        int counter = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n-------- Menu --------");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all FRESH fruits");
            System.out.println("6. Display tastes of all STALE fruits");
            System.out.println("7. Mark a fruit as stale (by index)");
            System.out.println("8. Mark all SOUR fruits as stale");
            System.out.println("-----------------------");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    exit = true;
                    System.out.println("Thank you!");
                    break;

                case 1: // Add Mango
                    if (counter < size) {
                        System.out.println("Enter Name, Weight, Color:");
                        basket[counter++] = new Mango(sc.next(), sc.nextDouble(), sc.next(), true);
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;

                case 2: // Add Orange
                    if (counter < size) {
                        System.out.println("Enter Name, Weight, Color:");
                        basket[counter++] = new Orange(sc.next(), sc.nextDouble(), sc.next(), true);
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;

                case 3: // Add Apple
                    if (counter < size) {
                        System.out.println("Enter Name, Weight, Color:");
                        basket[counter++] = new Apple(sc.next(), sc.nextDouble(), sc.next(), true);
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;

                case 4: // Display names
                    System.out.println("\nFruits in Basket:");
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;

                case 5: // Fresh fruits details
                    System.out.println("\nFresh Fruits Details:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh())
                            System.out.println(f + ", Taste=" + f.taste());
                    }
                    break;

                case 6: // Stale fruits taste
                    System.out.println("\nTastes of Stale Fruits:");
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh())
                            System.out.println(f.getName() + " -> " + f.taste());
                    }
                    break;

                case 7: // Mark specific fruit stale
                    System.out.print("Enter index to mark as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked as stale!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8: // Mark all sour fruits stale
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equals("sour"))
                            f.setFresh(false);
                    }
                    System.out.println("All sour fruits marked stale.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
