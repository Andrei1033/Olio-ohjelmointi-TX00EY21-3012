import java.util.Scanner;

public class task_2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a binary number (composed of 0s and 1s)");
        String binary = scanner.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++){
            char bit = binary.charAt(i);
            decimal = decimal * 2;

            if (bit == '1'){
                decimal++;
            }

        }

        System.out.println("Desimaaliluku: " + decimal);

    }
}
