import java.util.Scanner;

public class LukuEsimerki {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }
    }
}