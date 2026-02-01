package P_6;

import P_3.Customer;

public class CustomerGeneratorForTask6 {
    public static void generate(ServicePointUpdate servicePoint, int amount){
        for(int i = 0; i < amount; i++){
            Customer customer = new Customer(System.nanoTime());
            servicePoint.addToQueue(customer);
        }
    }
}
