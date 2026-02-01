package P_3;

public class P_3Test {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        Customer c1 = new Customer(start);

        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        c1.setEndTime(System.currentTimeMillis());

        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Time spent (ms): " + c1.getTimeSpent());
    }
}
