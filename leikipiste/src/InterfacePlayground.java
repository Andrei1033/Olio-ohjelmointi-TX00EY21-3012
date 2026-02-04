import java.util.*;

/* ===== INTERFACE ===== */
interface Vehicle {
    void start();
    void stop();
    String getInfo();
    double calculateFuelEfficiency();
}

/* ===== TOINEN INTERFACE ===== */
interface ElectricVehicle {
    void charge();
}

/* ===== ABSTRACT CLASS ===== */
abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String type;
    protected double efficiency;

    public AbstractVehicle(String type, double efficiency) {
        this.type = type;
        this.efficiency = efficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public double calculateFuelEfficiency() {
        return efficiency;
    }

    // oletustoteutus
    @Override
    public void charge() {
        System.out.println(type + " cannot be charged.");
    }
}

/* ===== CONCRETE CLASSES ===== */
class Car extends AbstractVehicle {

    public Car() {
        super("Car", 15.0);
    }

    @Override
    public String getInfo() {
        return "Type: Car, Fuel: Petrol";
    }
}

class Bus extends AbstractVehicle {

    public Bus() {
        super("Bus", 5.0);
    }

    @Override
    public String getInfo() {
        return "Type: Bus, Fuel: Diesel";
    }
}

class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", 0.20);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging 🔋");
    }

    @Override
    public String getInfo() {
        return "Type: Electric Car, Power: Electricity";
    }
}

/* ===== COMPARATOR ===== */
class EfficiencyComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return Double.compare(
                v1.calculateFuelEfficiency(),
                v2.calculateFuelEfficiency()
        );
    }
}

/* ===== MAIN ===== */
public class InterfacePlayground {

    public static void testVehicle(Vehicle v) {
        v.start();
        System.out.println(v.getInfo());
        System.out.println("Efficiency: " + v.calculateFuelEfficiency());
        v.stop();
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("=== INTERFACE + POLYMORPHISM ===");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bus());
        vehicles.add(new ElectricCar());

        for (Vehicle v : vehicles) {
            testVehicle(v);
        }

        System.out.println("=== ELECTRIC VEHICLE TEST ===");
        for (Vehicle v : vehicles) {
            if (v instanceof ElectricVehicle) {
                ((ElectricVehicle) v).charge();
            }
        }

        System.out.println("\n=== SORTING WITH COMPARATOR ===");
        vehicles.sort(new EfficiencyComparator());

        for (Vehicle v : vehicles) {
            System.out.println(
                    v.getInfo() + " | Efficiency: " + v.calculateFuelEfficiency()
            );
        }
    }
}
