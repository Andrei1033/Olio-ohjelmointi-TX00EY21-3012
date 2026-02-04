package P_2_and_P_3;

public class P_2Test {
    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(new Event(300, EventType.ARRIVAL));
        eventList.addEvent(new Event(100, EventType.EXIT));
        eventList.addEvent(new Event(200, EventType.ARRIVAL));

        System.out.println("Events in order:");

        while (!eventList.isEmpty()){
            System.out.println(eventList.removeNextEvent());
        }
    }
}
