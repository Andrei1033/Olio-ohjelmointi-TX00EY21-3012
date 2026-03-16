import java.util.Arrays;

public class task_1_functional {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 30, 40, 50};

        double mean = Arrays.stream(nums).average().orElse(0);
        System.out.println("Mean: " + mean);
    }
}
