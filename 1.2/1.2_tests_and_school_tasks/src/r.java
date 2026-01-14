import java.util.Scanner;

public class r {
    public static void main(String[] args){
        Scanner reader = new Skanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        int farenheits = Integer.parseInt(scanner.nextLine());

        System.out.println("temperatude in celcius is: " + ((double)(farenheits - 32) * 5 / 9));
    }
}