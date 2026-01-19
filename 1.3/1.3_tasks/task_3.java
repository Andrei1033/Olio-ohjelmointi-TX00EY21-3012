import java.util.Scanner;
public class task_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int startNum, endNum;

        while (true){
            System.out.print("Give a start number: ");
            startNum = scanner.nextInt();
            System.out.print("Give an end number: ");
            endNum = scanner.nextInt();

            if (startNum < 0 || endNum < 0){
                System.out.println("all numbers must be a positive numbers. Please re enter numbers!");
            }
            else if (startNum > endNum) {
                System.out.println("Your start number is bigger than end number. Please re enter numbers!");
            }
            else {
                break;
            }
        }

        int number = startNum;

        while (number <= endNum) {
            if (number > 1){
                boolean isPrime = true;
                int divisor = 2;

                while (divisor <= Math.sqrt(number)){
                    if (number % divisor == 0){
                        isPrime = false;
                        break;
                    }
                    divisor++;
                }
                if (isPrime){
                    System.out.println(number);
                }
            }

            number++;  // Kasvata startNum arvoa, muuten ikuinen looppi

        }
    }
}
