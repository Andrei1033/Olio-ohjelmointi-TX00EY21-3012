public class Calculator {
    private int currentSum;

    // Constructor resets calculator to zero
    public Calculator() {
        this.currentSum = 0;
    }

    // Method to reset the calculator
    public void reset() {
        this.currentSum = 0;
    }

    // Method to add a positive integer
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        this.currentSum += number;
    }

    // Method to return current value
    public int getCurrentSum() {
        return this.currentSum;
    }

    // Temporary main method to test the class
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            System.out.println("Adding 10...");
            calc.add(10);
            System.out.println("Current sum: " + calc.getCurrentSum());

            System.out.println("Adding 5...");
            calc.add(5);
            System.out.println("Current sum: " + calc.getCurrentSum());

            System.out.println("Resetting...");
            calc.reset();
            System.out.println("Current sum: " + calc.getCurrentSum());

            System.out.println("Adding -1 (Should throw exception)...");
            calc.add(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}