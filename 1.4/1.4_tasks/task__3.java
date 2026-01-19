import java.util.Arrays;
import  java.util.Scanner;
public class task__3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = input.nextInt();

        int[] array = new int[sizeOfArray];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter integer: " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        //int[] arrayNoDuplicates = Arrays.stream(array).distinct().toArray(); nopein ja helpoin metodi (ei voi käytä tehtävässä)

        int[] arrayNoDuplicates = new int[sizeOfArray];
        int count = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (array[i] == arrayNoDuplicates[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arrayNoDuplicates[count] = array[i];
                count++;
            }
        }

        System.out.println("The array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(arrayNoDuplicates[i] + " ");
        }
    }
}
