public class TheaterCustomer implements Runnable {
    private Theater theater;
    private int tickets;
    private int customerId;

    public  TheaterCustomer(Theater theater, int tickets, int customerId) {
        this.theater = theater;
        this.tickets = tickets;
        this.customerId = customerId;
    }


    @Override
    public void run() {

        boolean success = theater.reserveSeat(tickets);

        if (success) {
            System.out.println("Customer " + customerId + " reserved " + tickets + " tickets.");
        }
        else {
            System.out.println("Customer " + customerId + " couldn't reserve " + tickets + " tickets.");
        }
    }
}
