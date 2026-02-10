import P_2_and_P_3.Event;
import P_2_and_P_3.EventList;
import P_2_and_P_3.EventType;

import java.time.Clock;
import java.util.Random;

public class P_6_ArrivalProcess {
    private EventList eventList;
    private Random random;
    private double meanArrivalTime;

    public P_6_ArrivalProcess(EventList eventList, double meanArrivalTime) {
        this.eventList = eventList;
        this.meanArrivalTime = meanArrivalTime;
        random = new Random();
    }

    public void generateNextArrivalProcess() {

        long currentTime = P_5_Clock.getInstance().getTime();

        double a =  random.nextDouble();
        double interArrivalTime = -Math.log(1 - a) * meanArrivalTime;

        long arrivalTime = currentTime + (long) (interArrivalTime);

        Event event = new Event(arrivalTime, EventType.ARRIVAL);
        eventList.addEvent(event);
    }

}
