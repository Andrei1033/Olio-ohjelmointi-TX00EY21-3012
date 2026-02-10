import java.util.ArrayList;

public class ParallelNumbersTest {
    public static void main(String[] args) {

        // tehän taulukko
        int size = 100000;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }

        //selvitetään paljonko corra konesa on
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores: " + cores);

        int chunkSize = numbers.length / cores;

        ArrayList<Thread> threads = new ArrayList<Thread>();
        ArrayList<ParallelNumbers> tasks = new ArrayList<ParallelNumbers>();

        long startTime = System.nanoTime();
        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? numbers.length : start + chunkSize;

            ParallelNumbers task = new ParallelNumbers(numbers, start, end);
            Thread thread = new Thread(task);

            tasks.add(task);
            threads.add(thread);

            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        long total = 0;
        for (ParallelNumbers task : tasks) {
            total += task.getSum();
        }

        System.out.println("Sum: " + total);
        System.out.println();
        System.out.println("Execution time: " + duration / 1_000_000 + " ms");
    }
}
