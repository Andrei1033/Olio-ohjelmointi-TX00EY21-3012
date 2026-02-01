package P_4;

import P_3.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_P_4 {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<Customer>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1 = Add customer");
            System.out.println("2 = Remove customer");
            System.out.println("3 = Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Customer c = new Customer(System.nanoTime());
                    queue.addFirst(c);
                    System.out.println("Customer " + c.getId() + " added to queue");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    }
                    else {
                        Customer removed = queue.removeLast();
                        removed.setEndTime(System.nanoTime());
                        System.out.println("Customer " + removed.getId() + " waited (ns): " + removed.getTimeSpent());
                    }
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
