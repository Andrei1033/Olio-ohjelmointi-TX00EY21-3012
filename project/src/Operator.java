public class Operator {
    private static final int OPERATORPROCESSINGTIME = 5;    // time spent in servicing the customer

    private String operator;
    private int callId;
    private int timer;
    private boolean running;

    public Operator(String operatorName) {
        operator = operatorName;
        running = false;
    }

    /* start servicing the given call */
    public void start(int call) {
        System.out.print(operator + " service starts ");
        callId = call;
        timer = OPERATORPROCESSINGTIME + 1;
        running = true;
    }

    /* check whether the operator is busy servicing a call */
    public boolean isBusy() {
        return running;
    }

    /* advance one time-slice forward */
    public void run() {
        if (running) {
            timer--;
            if (timer <= 0) {
                running = false;
                System.out.print("Call #" + callId + " served (" + operator + ")");
            }
        }
    }
}