public class P_5_Clock {
    private static P_5_Clock instance;
    private long time;

    private P_5_Clock() {
        time = 0;
    }

    public static P_5_Clock getInstance() {
        if (instance == null) {
            instance = new P_5_Clock();
        }
        return instance;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void advanceTime(long delta) {
        time += delta;
    }
}
