import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        List<Person_Task_1> people = new ArrayList<>();

        people.add(new Person_Task_1("Alice", 25, "New York"));
        people.add(new Person_Task_1("Bob", 30, "London"));
        people.add(new Person_Task_1("Charlie", 20, "New York"));
        people.add(new Person_Task_1("David", 40, "Paris"));

        // Sort by age using lambda
        people.sort((p1, p2) -> p1.age - p2.age);

        System.out.println("Sorted by age:");
        people.forEach(p -> System.out.println(p));

        // Filter people from New York
        people.removeIf(p -> !p.city.equals("New York"));

        System.out.println("\nPeople from New York:");
        people.forEach(p -> System.out.println(p));
    }
}
