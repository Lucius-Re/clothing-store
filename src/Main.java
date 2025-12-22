public class Main {
    public static void main(String[] args) {

        System.out.println("=== Clothing Store Management System ===\n");

        // Create clothing items
        ClothingItem item1 = new ClothingItem(1, "Jacket", "L", 25000, "Zara");
        ClothingItem item2 = new ClothingItem();

        // Create customer
        Customer customer1 = new Customer(101, "Aibar", "L", 80);

        // Create order
        Order order1 = new Order(5001, customer1.getName(), 0.0, "Pending");

        System.out.println("--- ITEMS ---");
        System.out.println(item1);
        System.out.println(item2);

        System.out.println("\n--- CUSTOMER ---");
        System.out.println(customer1);

        System.out.println("\n--- ORDER ---");
        order1.addToTotal(item1.getPrice());
        order1.completeOrder();
        System.out.println(order1);

        System.out.println("\n--- METHODS TEST ---");
        item1.applyDiscount(10);
        customer1.addPoints(30);

        System.out.println(item1.getName() + " premium: " + item1.isPremium());
        System.out.println(customer1.getName() + " VIP: " + customer1.isVIP());

        System.out.println("\n=== Program Complete ===");
    }
}