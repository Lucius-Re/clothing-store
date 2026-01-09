import java.util.Scanner;

public class Menu {

    private Inventory inventory;
    private Scanner scanner;

    public Menu(Inventory inventory) {
        this.inventory = inventory;
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    inventory.listItems();
                    break;
                case 0:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 0);
    }

    private void showMenu() {
        System.out.println("\n--- CLOTHING STORE MENU ---");
        System.out.println("1. Add clothing item");
        System.out.println("2. Remove clothing item");
        System.out.println("3. Show all items");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }

    private void addItem() {
        System.out.print("Enter item ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter size: ");
        String size = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        ClothingItem item = new ClothingItem(id, name, size, price, brand);
        inventory.addItem(item);

        System.out.println("Item added successfully.");
    }


    private void removeItem() {
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine();

        boolean removed = inventory.removeItem(name);

        if (removed) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }
}
