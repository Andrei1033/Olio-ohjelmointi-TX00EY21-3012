import  java.util.Scanner;
public class task__2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int numOfIntegers = input.nextInt();

        int[] array = new int[numOfIntegers];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < numOfIntegers; i++) {
            System.out.print("Enter integer: " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int maxSum = array[0];
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 0; i < numOfIntegers; i++) {
            int sum = 0;

            for (int j = i; j < numOfIntegers; j++) {
                sum += array[j];

                if (sum > maxSum) {
                    maxSum = sum;
                    bestStart = i;
                    bestEnd = j;

                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (bestStart + 1) + "-" + (bestEnd + 1));

    }
}

