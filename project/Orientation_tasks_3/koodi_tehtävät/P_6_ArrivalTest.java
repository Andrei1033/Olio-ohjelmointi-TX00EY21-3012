import P_2_and_P_3.EventList;

public class P_6_ArrivalTest {
    public static void main(String[] args) {
        EventList eventList = new EventList();
        P_5_Clock.getInstance().setTime(0);

        P_6_ArrivalProcess ap = new P_6_ArrivalProcess(eventList, 10);

        for (int i = 0; i <= 5; i++) {
            ap.generateNextArrivalProcess();
        }

        while (!eventList.isEmpty()) {
            System.out.println(eventList.removeNextEvent());
        }
    }
}
