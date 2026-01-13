import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));

        // tapa missä 3.0 muuntaa koko laskun double muotoon. Eli jos joku laskussa olevista numeroista on desimaaliluku java laske myös koko laskun desimaali muodossa automaatisesti!
        System.out.println("The average of the numbers is (method 1)" + (first + second + third) / 3.0);

        // tapa missä muunetan lasku doublen sanomalla se manuaalisesti
        System.out.println("The average of the numbers is (mathod 2)" + ((double)(first + second + third) / 3));
    }
}