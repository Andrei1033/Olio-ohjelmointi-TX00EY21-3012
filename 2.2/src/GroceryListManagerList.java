import java.util.*;

public class GroceryListManagerList {
    private ArrayList<String> groceryList = new ArrayList<>(Arrays.asList("Apples", "Milk", "Bread"));

    // Add methods here
    public void addItem(String item){
        groceryList.add(item);
    }

    public void removeItem(String item){
        groceryList.remove(item);
    }

    public void displayList(){
        System.out.println("Grocery List:");
        for(String item : groceryList){
            System.out.println(item);
        }
    }

    public boolean checkItem(String item){
        return groceryList.contains(item);
    }

    public static void main(String[] args){
        GroceryListManagerList manager = new GroceryListManagerList();

        manager.displayList();

        System.out.println();

        System.out.println("Adding Items \" Juice & Eggs\"");
        manager.addItem("Juice");
        manager.addItem("Eggs");
        manager.displayList();
        System.out.println("Is \"Juice\" in the grocery list? " + manager.checkItem("Juice"));

        System.out.println();

        System.out.println("Removing \"Bread\" from the list...");
        manager.removeItem("Bread");
        manager.displayList();
        System.out.println("Is \"Bread\" in the grocery list? " + manager.checkItem("Bread"));
    }
}