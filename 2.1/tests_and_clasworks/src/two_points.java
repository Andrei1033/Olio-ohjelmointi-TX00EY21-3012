public class two_points {
    /* Sqrt() calculation using Newton-Raphson method to demonstrate the while-loop
     * See https://en.wikipedia.org/wiki/Newton%27s_method or https://math.mit.edu/~stevenj/18.335/newton-sqrt.pdf
     */
    private static double sqrt(double a) {
        double x = a/2;                       // Initial quess for the square root
        double eps = 4*Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {    // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;
            System.out.println(x);// Improve the estimate x for the square root
        }

        return (x);
    }

    private static double distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        return (sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2)));
    }

    public static void main(String[] args) {
        int x1, y1, z1;
        int x2, y2, z2;

        x1 = 11; y1 = 12; z1 = 13;  // Point 1
        x2 = 23; y2 = 24; z2 = 25;  // Point 2

        System.out.println("The distance between points is " + distance(x1, y1, z1, x2, y2, z2));
        System.out.println("The distance between point 1 and origin is " + distance(x1, y1, z1, 0, 0, 0));
        System.out.println("Two-dimensional distance between points is " + sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
    }
}