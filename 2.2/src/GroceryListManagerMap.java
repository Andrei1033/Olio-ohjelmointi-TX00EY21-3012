import java.util.*;

public class GroceryListManagerMap {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, double price) {
        groceryList.put(item, price);
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public void displayList(){
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList.keySet()) {
            System.out.println(index + ". " + item + " - " + groceryList.get(item) + " €");
            index++;
        }
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public double calculateTotalPrice(){
        double total = 0;
        for (String price : groceryList.keySet()) {
            total += groceryList.get(price);
        }
        return total;
    }

    public static void main(String[] args){
        GroceryListManagerMap manager = new GroceryListManagerMap();

        // default items
        manager.addItem("Apples", 2.50);
        manager.addItem("Milk", 1.80);
        manager.addItem("Bread", 3.20);

        manager.displayList();
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");

        System.out.println();

        System.out.println("Adding Items \" Juice & Kakka\"");
        manager.addItem("Juice", 3.45);
        manager.addItem("Kakka", 0.10);
        manager.displayList();
        System.out.println("Is \"Juice\" in the grocery list? " + manager.checkItem("Juice"));
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");

        System.out.println();

        System.out.println("Removing \"Bread\" from the list...");
        manager.removeItem("Bread");
        manager.displayList();
        System.out.println("Is \"Bread\" in the grocery list? " + manager.checkItem("Bread"));
        System.out.println("Total Price : " + String.format("%.2f", manager.calculateTotalPrice()) + "€");
    }
}