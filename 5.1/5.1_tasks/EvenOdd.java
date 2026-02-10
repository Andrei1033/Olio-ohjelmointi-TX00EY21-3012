public class EvenOdd implements Runnable {
    private long start;
    private long end;
    private boolean printEven;

    public EvenOdd(long start, long end,  boolean printEven) {
        this.start = start;
        this.end = end;
        this.printEven = printEven;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            if (printEven && i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }
            if (printEven && i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
