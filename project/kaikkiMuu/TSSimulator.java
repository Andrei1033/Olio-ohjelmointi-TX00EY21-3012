import java.util.*;
public class TSSimulator {
    private static final int ARRIVALRATE = (int)(Math.random() * 10) + 1;               // time between call arrivals
    private static final int OPERATORPROCESSINGTIME = (int)(Math.random() * 10) + 1;    // time spent in servicing the customer

    public static void main(String[] args) {
        int arrival = ARRIVALRATE;
        int operator1 = 0, operator2 = 0;
        boolean operator1Running = false, operator2Running = false;

        int call = 1, op1call = 0, op2call = 0;

        // main simulation loop, t represent the number of the current time-slice
        for (int t = 0; t <= 297654567; t++) {
            System.out.print("Time " + t + "min: ");
            if (arrival == 0) {
                // new call has arrived
                System.out.print("New call #" + call + " received ");
                arrival = ARRIVALRATE;

                // check which operator is free to serve the current call
                if (!operator1Running) {
                    System.out.print("Operator 1 service starts ");
                    op1call = call;
                    operator1Running = true; operator1 = OPERATORPROCESSINGTIME;
                } else if (!operator2Running) {
                    System.out.print("Operator 2 service starts ");
                    op2call = call;
                    operator2Running = true; operator2 = OPERATORPROCESSINGTIME;
                } else {
                    System.out.print("***System is too busy***");
                }
                call++;
            }

            // check whether operators have done their services
            if (operator1Running && operator1 == 0) {
                System.out.print("Call #" + op1call + " serviced (operator1)");
                operator1Running = false;
            }
            if (operator2Running && operator2 == 0) {
                System.out.print("Call #" + op2call + " serviced (operator2)");
                operator2Running = false;
            }

            // update time delay counters
            arrival--; operator1--; operator2--; System.out.println("");
        }
    }
}