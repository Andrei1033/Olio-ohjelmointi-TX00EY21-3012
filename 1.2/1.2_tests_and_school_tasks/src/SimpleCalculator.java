import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first number: ");
        double firstNumber = Double.parseDouble(reader.nextLine());

        System.out.print("Type the second number: ");
        double secondNumber = Double.parseDouble(reader.nextLine());

        System.out.print("Type the third number: ");
        double thirdNumber = Double.parseDouble(reader.nextLine());

        double sum = firstNumber + secondNumber + thirdNumber;
        double average = sum / 3;
        double product = firstNumber * secondNumber * thirdNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
    }
}