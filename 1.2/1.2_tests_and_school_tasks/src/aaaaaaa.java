import java.util.Scanner;

public class aaaaaaa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine();

        System.out.print("how old are you ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Hello " + name + "!");
        System.out.println("Age " + age + "!");
    }
}