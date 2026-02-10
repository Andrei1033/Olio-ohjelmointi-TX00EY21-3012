import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class CPUStressTest {

    public static void main(String[] args) {
        System.out.println("CPU Stress Test Starting...");

        // Get available processors
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU cores: " + cores);

        // Use all cores for maximum stress
        int threadCount = cores;
        System.out.println("Creating " + threadCount + " worker threads");

        // Control flag
        AtomicBoolean running = new AtomicBoolean(true);

        // Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        // Create and submit worker threads
        for (int i = 0; i < threadCount; i++) {
            final int threadId = i;
            executor.submit(() -> {
                System.out.println("Thread " + threadId + " started");
                while (running.get()) {
                    // Perform CPU-intensive calculations
                    performCalculations(threadId);
                }
                System.out.println("Thread " + threadId + " stopped");
            });
        }

        // Add shutdown hook for graceful termination
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nShutting down...");
            running.set(false);
            executor.shutdown();
            try {
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
            }
            System.out.println("CPU Stress Test Stopped");
        }));

        // Let it run for a while or until interrupted
        System.out.println("\nCPU Stress Test Running. Press Ctrl+C to stop.\n");

        // Keep main thread alive
        try {
            while (running.get()) {
                Thread.sleep(1000);

                // Optional: Print some stats periodically
                if (System.currentTimeMillis() % 10000 < 1000) {
                    System.out.println("Still running... Press Ctrl+C to stop");
                }
            }
        } catch (InterruptedException e) {
            running.set(false);
        }
    }

    private static void performCalculations(int threadId) {
        // This is a CPU-intensive calculation loop
        // Using a combination of math operations to keep CPU busy

        long iterations = 10000000; // Adjust based on your system
        double result = 0;

        for (long i = 0; i < iterations; i++) {
            // Various math operations to stress CPU
            double val = Math.sin(i) * Math.cos(i) * Math.tan(i);
            result += Math.sqrt(Math.abs(val));
            result = result % 1000; // Prevent overflow
        }

        // Prevent compiler optimization
        if (result < 0) {
            System.out.println("Unexpected result in thread " + threadId);
        }
    }
}