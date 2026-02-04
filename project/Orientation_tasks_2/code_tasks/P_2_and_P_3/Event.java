package P_2_and_P_3;

public class Event implements Comparable<Event> {
    private long time;
    private EventType type;

    public Event(long time, EventType type) {
        this.time = time;
        this.type = type;
    }

    public long getTime() {
        return time;
    }
    public EventType getType() {
        return type;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Event{" + "type=" + type + ", time=" + time + '}';
    }
}
