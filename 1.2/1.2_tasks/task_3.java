import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double weight = scanner.nextDouble();

        double gramsPerLuoti = 13.28;
        double gramsPerNaula = 32 * gramsPerLuoti;
        double gramsPerLeiviska = 20 * gramsPerNaula;

        int leiviska = (int) (weight / gramsPerLeiviska);
        double weightAfterLeiviska = weight - leiviska * gramsPerLeiviska;

        int naula = (int) (weightAfterLeiviska / gramsPerNaula);
        double weightAfterNaula = weightAfterLeiviska - naula * gramsPerNaula;

        double luoti = weightAfterNaula / gramsPerLuoti;

        System.out.printf((int) weight + " grams is " + leiviska + " leiviskä, " + naula + " naula, and %.2f%n", luoti, " luoti.");
    }
}