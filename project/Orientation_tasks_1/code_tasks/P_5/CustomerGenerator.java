package P_5;

import P_3.Customer;

// Creates multiple customers and adds them to the service point queue
public class CustomerGenerator {
    public static void generate(ServicePoint servicePoint, int amount){
        for(int i = 0; i < amount; i++){
            Customer customer = new Customer(System.nanoTime());
            servicePoint.addToQueue(customer);
        }
    }
}
