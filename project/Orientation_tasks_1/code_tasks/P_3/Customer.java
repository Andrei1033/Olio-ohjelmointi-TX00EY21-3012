package P_3;

// Represents a customer in the queuing system with arrival/departure tracking
public class Customer {
    private static int nextId = 0;

    private int id;
    private long startTime;
    private long endTime;

    public  Customer(long startTime) {
        this.id = nextId;
        nextId++;
        this.startTime = startTime;
    }


    public int getId() {
        return id;
    }
    public long getStartTime() {
        return startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getTimeSpent() {
        return endTime - startTime;
    }
}


