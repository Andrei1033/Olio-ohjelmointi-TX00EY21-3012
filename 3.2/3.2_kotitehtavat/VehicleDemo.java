public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        System.out.println();

        // Normal vehicles
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bus = new Bus();

        // Electric vehicles
        Vehicle electricCar = new ElectricCar();
        Vehicle electricMotorcycle = new ElectricMotorcycle();

        // ---- Car ----
        car.start();
        car.stop();
        car.charge();   // Not possible to charge
        System.out.println(car.getInfo());

        System.out.println();

        // ---- Motorcycle ----
        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge(); // Not possible to charge
        System.out.println(motorcycle.getInfo());

        System.out.println();

        // ---- Bus ----
        bus.start();
        bus.stop();
        bus.charge();   // Not possible to charge
        System.out.println(bus.getInfo());

        System.out.println();

        // ---- Electric Car ----
        electricCar.start();
        electricCar.stop();
        electricCar.charge(); // Charging works
        System.out.println(electricCar.getInfo());

        System.out.println();

        // ---- Electric Motorcycle ----
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.charge(); // Charging works
        System.out.println(electricMotorcycle.getInfo());
    }
}
