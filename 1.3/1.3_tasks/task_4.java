import java.util.Scanner;
public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = 0;
        int points = 0;

        while (true){
            while (times < 10) {
                int number1 = (int)(Math.random() * 10) + 1;
                int number2 = (int)(Math.random() * 10) + 1;
                int correctAnswer = number1 * number2;

                times++;
                System.out.println("Question " + times + ": " + number1 + " * " + number2 + " = ?");
                int usersAnswer = scanner.nextInt();

                if (usersAnswer == correctAnswer) {
                    points++;
                    System.out.println("Correct!");
                    System.out.println();
                }
                else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer);
                    System.out.println();
                }

            }

            if (points == 10) {
                System.out.println("You scored " + points + " out of " + points);
                System.out.println("Congratulations! You have mastered the multiplication tables!");
                break;
            }
            else {
                System.out.println("You scored " + points + " out of 10");
                System.out.println("Let's try another round!");
                times = 0;
                points = 0;
            }

        }

    }
}
