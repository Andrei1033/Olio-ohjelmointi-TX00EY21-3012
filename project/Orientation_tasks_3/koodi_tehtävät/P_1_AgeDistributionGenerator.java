import java.util.Random;

public class P_1_AgeDistributionGenerator {

    static final int MAXAGE = 35;

    static int ageDistribution[][] = {
            {16, 20},
            {34, 21},
            {52, 22},
            {68, 23},
            {82, 24},
            {89, 25},
            {94, 26},
            {96, 28},
            {98, 30},
            {100, MAXAGE}
    };

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            System.out.println(generateAge(random));
        }
    }

    public static int generateAge(Random random) {

        int r = random.nextInt(100) + 1;

        for (int i = 0; i < ageDistribution.length; i++) {
            if (r <= ageDistribution[i][0]) {
                return ageDistribution[i][1];
            }
        }

        return MAXAGE;
    }
}
