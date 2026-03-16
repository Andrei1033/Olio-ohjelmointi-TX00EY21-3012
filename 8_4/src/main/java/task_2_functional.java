import java.util.Arrays;
import java.util.List;

public class task_2_functional {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = list.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
