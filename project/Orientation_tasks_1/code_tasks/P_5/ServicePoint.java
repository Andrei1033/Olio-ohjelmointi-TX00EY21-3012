package P_5;

import P_3.Customer;
import java.util.LinkedList;

// Simulates a service counter that processes customers from a queue with random service times
public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

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
}
