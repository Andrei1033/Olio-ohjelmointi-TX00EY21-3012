public class GroceryListTester {
    public static void main(String[] args) {
        GroceryListManagerTester manager = new GroceryListManagerTester();

        // 1️⃣ Lisää itemit eri kategorioihin ja eri quantityillä
        manager.addItem("Apples", 2.50, "Fruit", 6);
        manager.addItem("Milk", 1.80, "Drink", 1);
        manager.addItem("Bread", 3.20, "Bakery", 2);

        // 2️⃣ Näytä lista ja total cost
        manager.displayList();
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");
        System.out.println();

        // 3️⃣ Lisää lisää itemeitä ja testaa checkItem
        System.out.println("Adding Items \" Juice & Kakka\"");
        manager.addItem("Juice", 3.45, "Drink", 1);
        manager.addItem("Kakka", 0.10, "Prank", 2);
        manager.displayList();
        System.out.println("Is \"Juice\" in the grocery list? " + manager.checkItem("Juice"));
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");
        System.out.println();

        // 4️⃣ Poista item ja tarkista
        System.out.println("Removing \"Bread\" from the list...");
        manager.removeItem("Bread");
        manager.displayList();
        System.out.println("Is \"Bread\" in the grocery list? " + manager.checkItem("Bread"));
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");
        System.out.println();

        // 5️⃣ Näytä items by category
        System.out.println("display by category: ");
        manager.displayByCategory("Drink");
        manager.displayByCategory("Meat");
        System.out.println();

        // 6️⃣ displayAvailableItems ja quantity 0 case
        manager.addItem("Banana", 8.10, "Fruit", 0);
        manager.displayList();
        System.out.println("\nAvailable items only:");
        manager.displayAvailableItems();
        System.out.println();

        // 7️⃣ updateQuantity ja uudelleen displayAvailableItems
        System.out.println("\nUpdating quantity of Banana to 5 pcs...");
        manager.updateQuantity("Banana", 5);  // päivitetään quantity
        System.out.println("Available items after update:");
        manager.displayAvailableItems();

    }
}
