import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10,5,8,20,15,3,12,9861,424,1,5345,7,2,87,2,889,98765)
        );

        System.out.println("Original list: ");
        numbers.forEach(n -> System.out.print(n + " "));

        // Remove even numbers
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("\n\nOnly odd numbers: ");
        numbers.forEach(n -> System.out.print(n + " "));

        // Double odd numbers
        numbers.replaceAll(n -> n * 2);

        System.out.println("\n\nAfter doubling: ");
        numbers.forEach(n -> System.out.print(n + " "));

        // sum numbers
        System.out.println("\n\nSum of numbers: ");
        int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Sum = " + sum[0]);
    }
}
