import java.util.*;

public class GroceryListManagerQuantity {
    private HashMap<String, GroceryItemQ> groceryList = new HashMap<>();

    // Add methods here

    // Add item with category
    public void addItem(String item, double price, String category, int quantity) {
        groceryList.put(item, new GroceryItemQ(price, category, quantity));
    }
    // Add item without category (default)
    public void addItem(String item, double price, int quantity) {
        addItem(item, price, "-", quantity);
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public void displayList(){
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList.keySet()) {
            GroceryItemQ groceryItem = groceryList.get(item);
            System.out.println(index + ". " + item + " - " + groceryItem.getPrice() + " € (" + groceryItem.getCategory() + ") kpl " + groceryItem.getQuantity());
            index++;
        }
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public void displayByCategory(String category){
        System.out.println("Category: " + category);
        boolean found = false;
        for (String item : groceryList.keySet()) {
            GroceryItemQ groceryItem = groceryList.get(item);
            if (groceryItem.getCategory().equals(category)) {
                System.out.println(item + " - " + groceryItem.getPrice() + " €");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    public double calculateTotalPrice(){
        double total = 0;
        for (GroceryItemQ groceryItem : groceryList.values()) {
            total += groceryItem.getPrice() * groceryItem.getQuantity();
        }
        return total;
    }

    public void updateQuantity(String item, int newQuantity){
        if (groceryList.containsKey(item)){
            groceryList.get(item).setQuantity(newQuantity);
        }
    }

    public void displayAvailableItems(){
        System.out.println("Available Items:");
        for (String item : groceryList.keySet()) {
            GroceryItemQ groceryItem = groceryList.get(item);
            if (groceryItem.getQuantity() > 0){
                System.out.println(item + " (" + groceryItem.getQuantity() + " pcs)");
            }
        }
    }


    public static void main(String[] args){
        GroceryListManagerQuantity manager = new GroceryListManagerQuantity();

        // default items
        manager.addItem("Apples", 2.50, "Fruit", 6);
        manager.addItem("Milk", 1.80, "Drink", 1);
        manager.addItem("Bread", 3.20, "Bakery", 2);

        manager.displayList();
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");

        System.out.println();

        System.out.println("Adding Items \" Juice & Kakka\"");
        manager.addItem("Juice", 3.45, "Drink", 1);
        manager.addItem("Kakka", 0.10, "Prank", 2);
        manager.displayList();
        System.out.println("Is \"Juice\" in the grocery list? " + manager.checkItem("Juice"));
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");

        System.out.println();

        System.out.println("Removing \"Bread\" from the list...");
        manager.removeItem("Bread");
        manager.displayList();
        System.out.println("Is \"Bread\" in the grocery list? " + manager.checkItem("Bread"));
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");

        System.out.println();

        System.out.println("display by category: ");
        manager.displayByCategory("Drink");
        manager.displayByCategory("Meat");

        System.out.println();

        manager.addItem("Banana", 8.10, "Fruit", 0);
        manager.displayList();
        System.out.println("\nAvailable items only:");
        manager.displayAvailableItems();

        System.out.println();

        System.out.println("\nUpdating quantity of Banana to 5 pcs...");
        manager.updateQuantity("Banana", 5);  // päivitetään quantity

        System.out.println("Available items after update:");
        manager.displayAvailableItems();

    }
}

class GroceryItemQ {
    private double price;
    private String category;
    private int quantity;

    public GroceryItemQ(double price, String category, int quantity) {
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory(){
        return category;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}