import java.util.Scanner;
import static java.lang.Math.*;

public class task_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna ensimmäinen kateeti");
        int kateeti_1 = scanner.nextInt();

        System.out.println("Anna toinen kateeti");
        int kateeti_2 = scanner.nextInt();

        // nopea ja yksinkertainen tapa
        double hypotenuusa = Math.sqrt(kateeti_1 * kateeti_1 + kateeti_2 * kateeti_2);

        // tapa missä käytetään potensia kuuten kaskimessa
        double hypotenuusa_tapa_2 = Math.sqrt(Math.pow(kateeti_1, 2) + Math.pow(kateeti_2, 2));


        System.out.println("kolmio hypotenuusan pitus on: " + hypotenuusa);
    }
}