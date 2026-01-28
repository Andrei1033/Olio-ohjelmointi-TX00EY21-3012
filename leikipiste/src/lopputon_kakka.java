import java.util.ArrayList;
import java.util.List;

public class lopputon_kakka {
    public static void main(String[] args) {
        System.out.println("#######");
        for (int i = 0; i < 9; i += 2) {
            System.out.println(i);
        }

        System.out.println("#######");
        for (int i = 9; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("#######");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        System.out.println("#######");

        int[] lista = {112, 1, 2, 3, 4, 5, 6, 7, 8, 9, 99, 221, 2};
        for (int i : lista) {
            System.out.println(i);
        }

        System.out.println("######## Yli määräistä");

        // Creating the equivalent of the Python list comprehension
        List<Integer> apu = new ArrayList<>();
        for (int x = 2; x < 6; x++) {
            apu.add(x);
        }
        for (int z = 8; z < 10; z++) {
            apu.add(z);
        }
        System.out.println(apu);

        for (int i : apu) {
            System.out.println(i);
            System.out.println("Kuole kakka!!!");
        }

        int kissa = 1;
        for (int i = 0; i < 10000; i++) {
            kissa = kissa + 1;
            System.out.println(kissa);
        }


        for (int i = 0; i < 1000000000; i++) {
            System.out.printf("%f Kuole kakka!!! %f Kuole kokonaan kakka!!! %d Älä Kuole kakka!!!%n", 
                123.0 * i / 1234.0, 
                9 - i * 98.0 / 4596.0 + i, 
                156 - i + 8);
            System.out.printf("%d Älä Kuole kakka!!!%n", 1056 - i + 7);
            System.out.printf("%f Kuole kokonaan kakka!!! %d Älä Kuole kakka!!!%n", 
                19 - i * 98.0 / 4516.0 - i, 
                666 - i + 777);
        }
    }
}