public class ParallelNumbers implements Runnable {
    private int[] numbers;
    private int start;
    private int end;
    private long sum;

    public ParallelNumbers(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }

}
