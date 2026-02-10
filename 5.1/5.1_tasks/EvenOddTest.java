import java.util.Scanner;

public class EvenOddTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number: ");
        long start = scanner.nextLong();

        System.out.print("Enter end number: ");
        long end = scanner.nextLong();

        // Create tasks
        EvenOdd evenTask = new EvenOdd(start, end, true);
        EvenOdd oddTask = new EvenOdd(start, end, false);

        // Create threads
        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        // Start threads
        evenThread.start();
        oddThread.start();

        // Wait for threads to finish
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Printing complete.");
    }
}
