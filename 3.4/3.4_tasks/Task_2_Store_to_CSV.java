import java.io.*;

public class Task_2_Store_to_CSV {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("fibonacci.csv");

            long a = 0;
            long b = 1;

            writer.write("index;Fibonacci\n");

            for (int i = 1; i <= 60; i++) {
                writer.write(i + ";" + a + "\n");

                long next = a + b;
                a = b;
                b = next;
            }
            writer.close();
            System.out.println("Fibonacci CSV is done");
        } catch (IOException e) {
            System.out.println("Virhe tiedostoa luotaessa: " + e.getMessage());
        }

        // avatan ja luetan tiedosto
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fibonacci.csv"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
