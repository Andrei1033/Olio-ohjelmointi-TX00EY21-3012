package P_6;

import P_3.Customer;
import java.util.LinkedList;

public class ServicePointUpdate {
    private LinkedList<Customer> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int servedCustomers  = 0;

    public void addToQueue(Customer customer) {
        queue.add(customer);
    }

    public Customer removeFromQueue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }


    public void service(){
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            long serviceTime = (long)(Math.random() * 1000 + 500);

            totalServiceTime += serviceTime;
            servedCustomers ++;

            try {
                Thread.sleep(serviceTime);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            customer.setEndTime(System.nanoTime());

            System.out.println("Customer " + customer.getId() + " service time (ms): " + serviceTime + ", response time (ns): " + customer.getTimeSpent());
        }
    }

    public double getAverageServiceTime() {
        if (servedCustomers == 0) {
            return 0;
        }
        return (double)totalServiceTime / servedCustomers;
    }
}
