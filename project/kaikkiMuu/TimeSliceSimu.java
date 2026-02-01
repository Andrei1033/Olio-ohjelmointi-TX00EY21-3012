import java.util.ArrayList;

/*
 * A simple time-slice simulator for phone calls arriving and two operators
 *  Phone call arrival times and operator service times are constant
 *  Time slice used is 1 minute
 */
public class TimeSliceSimu {
    private static final int ARRIVALRATE = 1;   // time between call arrivals
    private static final int OPERATORS = 6;     // number of operators

    public static void main(String[] args) {
        int arrival = ARRIVALRATE;
        int call = 1;

        // create operators
        ArrayList<Operator> operators = new ArrayList<>();
        for (int i = 0; i < OPERATORS; i++) {
            String opName = "Operator " + i;
            operators.add(new Operator(opName));
        }

        // main simulation loop, t represent the number of the current time-slice
        for (int t = 0; t <= 24; t++) {
            System.out.print("Time " + t + "min: ");
            if (arrival == 0) {
                // new call has arrived
                System.out.print("New call #" + call + " received ");
                arrival = ARRIVALRATE;

                // give the call to the first available operator
                boolean serviced = false;
                for (Operator op : operators) {
                    if (!op.isBusy()) {
                        op.start(call);
                        serviced = true;
                        break;
                    }
                }
                if (!serviced)  // if no operator was able to accept the call
                    System.out.print("***System is too busy***");
                call++;
            }

            // update the time (one time-slice has elapsed)
            arrival--;
            for (Operator op : operators)
                op.run();
            System.out.println("");
        }
    }
}