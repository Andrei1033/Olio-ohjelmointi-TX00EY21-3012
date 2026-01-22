import java.util.*;

public class GroceryListManagerTester {
    private HashMap<String, GroceryItemT> groceryList = new HashMap<>();

    // Add methods here

    // 1️ Lisää itemit eri kategorioihin ja eri quantityillä
    public void addItem(String item, double price, String category, int quantity) {
        groceryList.put(item, new GroceryItemT(price, category, quantity));
    }
    // Add item without category (default)
    public void addItem(String item, double price, int quantity) {
        addItem(item, price, "-", quantity);
    }

    // Poista item
    public void removeItem(String item){
        groceryList.remove(item);
    }

    // Näytä koko lista
    public void displayList(){
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList.keySet()) {
            GroceryItemT groceryItem = groceryList.get(item);
            System.out.println(index + ". " + item + " - " + groceryItem.getPrice() + " € (" + groceryItem.getCategory() + ") kpl " + groceryItem.getQuantity());
            index++;
        }
    }

    // Tarkista onko item listassa
    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    // Näytä items by category
    public void displayByCategory(String category){
        System.out.println("Category: " + category);
        boolean found = false;
        for (String item : groceryList.keySet()) {
            GroceryItemT groceryItem = groceryList.get(item);
            if (groceryItem.getCategory().equals(category)) {
                System.out.println(item + " - " + groceryItem.getPrice() + " €");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    // Laske total price **quantity huomioiden**
    public double calculateTotalPrice(){
        double total = 0;
        for (GroceryItemT groceryItem : groceryList.values()) {
            total += groceryItem.getPrice() * groceryItem.getQuantity();
        }
        return total;
    }

    // Päivitä itemin quantity
    public void updateQuantity(String item, int newQuantity){
        if (groceryList.containsKey(item)){
            groceryList.get(item).setQuantity(newQuantity);
        }
    }

    // Näytä vain saatavilla olevat (quantity > 0)
    public void displayAvailableItems(){
        System.out.println("Available Items:");
        for (String item : groceryList.keySet()) {
            GroceryItemT groceryItem = groceryList.get(item);
            if (groceryItem.getQuantity() > 0){
                System.out.println(item + " (" + groceryItem.getQuantity() + " pcs)");
            }
        }
    }
}

class GroceryItemT {
    private double price;
    private String category;
    private int quantity;

    public GroceryItemT(double price, String category, int quantity) {
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