package P_2_and_P_3;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> list;

    public EventList() {
        list = new PriorityQueue<>();
    }
    public void addEvent(Event e){
        list.add(e);
    }
    public Event getNextEvent(){
        return list.peek();
    }
    public Event removeNextEvent(){
        return list.poll();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

}
