interface ElectricVehicle {
    void charge();
}

class ElectricCar extends AbstractVehicle {
    private String color;
    public ElectricCar() {
        this.type = "Electric Car";
        this.fuel = "Electricity";
        this.color = "Orrange";
        this.fuelEfficiency = 0.15;
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }

    public String getInfo() {
        return "Electric Car Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color + "\n" +
                "Energy consumption: " + fuelEfficiency + " kWh/km";
    }
}

class ElectricMotorcycle extends AbstractVehicle {
    private String color;
    public ElectricMotorcycle() {
        this.type = "Electric Motorcycle";
        this.fuel = "Electricity";
        this.color = "White";
        this.fuelEfficiency = 0.09;
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }

    public String getInfo() {
        return "Electric Motorcycle Information:\n" +
                "Type: " + type + "\n" +
                "Fuel: " + fuel + "\n" +
                "Color: " + color + "\n" +
                "Energy consumption: " + fuelEfficiency + " kWh/km";
    }
}
