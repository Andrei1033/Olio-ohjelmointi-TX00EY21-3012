import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname;
        int age;
        ArrayList<Person> persons = new ArrayList<>();

        do {
            System.out.print("Give firstname: ");
            firstname = scanner.nextLine();
            if (firstname.length() > 0) {
                System.out.print("Give age: ");
                age = Integer.parseInt(scanner.nextLine());
                persons.add(new Person(firstname, age));
            }
        } while (firstname.length() > 0);

        if (!persons.isEmpty()) {
            System.out.println("Added " + persons.size() + " persons.");
            System.out.print("Give the index of the person searched for 0.." + (persons.size()-1) +": ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println(persons.get(index));
        }

        // Add one additional Person at the beginning of the list
        persons.add(0, new Person("Vilhelm", 90));

        System.out.println("\nAll persons:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
