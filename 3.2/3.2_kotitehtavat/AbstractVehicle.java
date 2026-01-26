public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected Double fuelEfficiency;

    public void start() {
        System.out.println(type + " is starting...");
    }
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    // Default behavior for non-electric vehicles
    public void charge() {
        System.out.println("Not possible to charge this vehicle.");
    }

    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract String getInfo();
}


