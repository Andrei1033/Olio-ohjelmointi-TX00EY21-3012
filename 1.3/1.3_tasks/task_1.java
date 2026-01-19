import java.util.Scanner;

public class task_1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("anna luku 1: ");
        double a = scanner.nextDouble();

        System.out.print("anna luku 2: ");
        double b = scanner.nextDouble();

        System.out.print("anna luku 3: ");
        double c = scanner.nextDouble();

        double discriminant  = Math.pow(b, 2) - 4*c*a;
        System.out.println("Your discriminant is: " + discriminant);
        System.out.println();

        if (discriminant  < 0){
            System.out.println("No real roots");
        }
        else if (discriminant  == 0) {
            double root = -b / (2 * a);
            System.out.println("Only one root: x = " + root);
        }
        else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("root 1: x = " + root1);
            System.out.println("root 2: x = " + root2);
        }

    }
}
