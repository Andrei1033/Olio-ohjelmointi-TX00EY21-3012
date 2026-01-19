import java.util.Scanner;
public class task__1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = {
                "Liam", "Olivia", "Noah", "Amelia", "Oliver",
                "Sophia", "Lucas", "Charlotte", "Mateo", "Aurelia"
        };
        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Brown", "Jones",
                "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"
        };

        System.out.println("How many random names should be generated?");
        long amount = scanner.nextLong();

        for (int i = 0; i < amount; i++) {
            int randomNameIndex = (int) (Math.random() * firstNames.length);
            int randomLastNameIndex = (int) (Math.random() * lastNames.length);

            System.out.println(firstNames[randomNameIndex] + " " + lastNames[randomLastNameIndex]);
        }

    }
}
