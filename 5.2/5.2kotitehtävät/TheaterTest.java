public class TheaterTest {
    public static void main(String[] args) {
        Theater theater = new Theater(10);

        Thread[] customer = new Thread[15];

        for(int i = 0; i < customer.length; i++){
            int tickets = (int)(Math.random() * 4) + 1;

            customer[i] = new Thread(new TheaterCustomer(theater, tickets, i+1));
            customer[i].start();
        }

        for (Thread thread : customer) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Seats left: " + theater.getAvailableSeats());
    }
}
