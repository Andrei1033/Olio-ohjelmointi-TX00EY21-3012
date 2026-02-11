public class Theater {
    private int availableSeats;

    public Theater(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserveSeat(int seats) {
        if (availableSeats >= seats) {
            availableSeats -= seats;
            return true;
        }
        else  {
            return false;
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
