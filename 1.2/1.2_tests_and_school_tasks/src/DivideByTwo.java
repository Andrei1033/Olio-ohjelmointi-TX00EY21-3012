import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = Integer.parseInt(scanner.nextLine());

        double doubleValue = (double)intValue / 2;

        System.out.println("The result is " + doubleValue);

        scanner.close();
    }
}