import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        SafeList safeList = new SafeList();

        int workerCount = 10;
        int operationsPerWorker = 1000;

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < workerCount; i++) {
            ListWorker worker = new ListWorker(safeList, i+1, operationsPerWorker);
            Thread thread = new Thread(worker);

            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {}
        }

        System.out.println("Final list size: " + safeList.size());

    }
}
