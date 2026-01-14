import java.util.Scanner;

public class if_else_harjoitus{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("anna luku");
        int luku = scanner.nextInt();

        System.out.println("anna luku2");
        int luku2 = scanner.nextInt();

        if (luku > 0){
            System.out.println("Luku on suurempi kuin 0");
        }

        if (luku == 0){
            System.out.println("Luku on 0");
        }

        if (luku > 0 && luku2 <= 10){
            System.out.println("molemat annetut luvut ovat 1 ja 10 välissä");
        }
    }
}