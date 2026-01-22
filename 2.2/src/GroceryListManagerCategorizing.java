import java.util.*;

public class GroceryListManagerCategorizing {
    private HashMap<String, GroceryItem> groceryList = new HashMap<>();

    // Add methods here

    // Add item with category
    public void addItem(String item, double price, String category) {
        groceryList.put(item, new GroceryItem(price, category));
    }
    // Add item without category (default)
    public void addItem(String item, double price) {
        addItem(item, price, "Uncategorized");
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public void displayList(){
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList.keySet()) {
            GroceryItem groceryItem = groceryList.get(item);
            System.out.println(index + ". " + item + " - " + groceryItem.getPrice() + " € (" + groceryItem.getCategory() + ")");
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
            GroceryItem groceryItem = groceryList.get(item);
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
        for (GroceryItem groceryItem : groceryList.values()) {
            total += groceryItem.getPrice();
        }
        return total;
    }


    public static void main(String[] args){
        GroceryListManagerCategorizing manager = new GroceryListManagerCategorizing();

        // default items
        manager.addItem("Apples", 2.50, "Fruit");
        manager.addItem("Milk", 1.80, "Drink");
        manager.addItem("Bread", 3.20, "Bakery");

        manager.displayList();
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");

        System.out.println();

        System.out.println("Adding Items \" Juice & Kakka\"");
        manager.addItem("Juice", 3.45, "Drink");
        manager.addItem("Kakka", 0.10, "Prank");
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
    }
}

class GroceryItem{
    private double price;
    private String category;

    public  GroceryItem(double price, String category){
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory(){
        return category;
    }
}