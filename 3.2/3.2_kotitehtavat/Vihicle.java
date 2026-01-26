interface Vehicle {
    public void start();
    public void stop();
    String getInfo();
    void charge();
    double calculateFuelEfficiency();
}

class Car extends AbstractVehicle {
    private String color;
    public Car() {
        this.type = "Car";
        this.fuel = "Petrol";
        this.color = "Red";
        this.fuelEfficiency = 6.7;
    }
    public String getInfo() {
        return "Car Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color + "\n" +
                "FuelEfficiency: " + fuelEfficiency + " L/100km";
    }
}


class Motorcycle extends AbstractVehicle {
    private String color;
    public Motorcycle() {
        this.type = "Motorcycle";
        this.fuel = "Gasoline";
        this.color = "Black";
        this.fuelEfficiency = 50.8;

    }
    public String getInfo() {
        return "Motorcycle Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color + "\n" +
                "FuelEfficiency: " + fuelEfficiency + " MPG";
    }
}


class Bus extends AbstractVehicle {
    private int capacity;
    public Bus() {
        this.type = "Bus";
        this.fuel = "Diesel";
        this.capacity = 40;
        this.fuelEfficiency = 36.2;
    }
    public String getInfo() {
        return "Bus Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "FuelEfficiency: " + fuelEfficiency + " L/100km";
    }

}

