import java.time.Clock;

public class P_5_ClockTest {
    public static void main(String[] args) {

        P_5_Clock clock1 = P_5_Clock.getInstance();
        P_5_Clock clock2 = P_5_Clock.getInstance();

        clock1.advanceTime(10);
        clock2.advanceTime(0);

        System.out.println("Clock1 time: " + clock1.getTime());
        System.out.println("Clock2 time: " + clock2.getTime());

    }
}
