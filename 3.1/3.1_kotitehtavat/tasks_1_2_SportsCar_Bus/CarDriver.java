package tasks_1_2_SportsCar_Bus;

public class CarDriver {
    public static void main(String[] args) {
        Car normalCar = new Car("Toyota Corolla", 60, 100);
        SportsCar sportsCar = new SportsCar("Ferrari", 60, 40);
        Bus bus = new Bus("Scania", 60, 500, 50);


        System.out.println("Bus entering");
        for (int i = 0; i < 5; i++) {
            bus.passengerEnter();
        }
        System.out.println("Bus passengers: " + bus.getPassengers());

        System.out.println();
        System.out.println("Bus exiting");
        for (int i = 0; i < 5; i++) {
            bus.passengerExit();
        }
        System.out.println("Bus passengers: " + bus.getPassengers());
        System.out.println("Trying to exit buss when it is already empty");
        bus.passengerExit();


        System.out.println();
        System.out.println("normal car acelerating");
        normalCar.accelerate();
        System.out.println(normalCar.getTypeName() + " speed: " + normalCar.getSpeed());
        System.out.println(normalCar.gasolineLevel + " gasoline level: " + normalCar.getGasolineLevel());

        System.out.println();
        sportsCar.accelerate();
        System.out.println("sports car accelerating");
        System.out.println(sportsCar.getTypeName() + " speed: " + sportsCar.getSpeed());
        System.out.println(sportsCar.gasolineLevel + " gasoline level: " + sportsCar.getGasolineLevel());

        System.out.println();
        System.out.println("Bus acelerating");
        bus.accelerate();
        System.out.println(bus.getTypeName() + " speed: " + bus.getSpeed());
        System.out.println(bus.gasolineLevel + " gasoline level: " + bus.getGasolineLevel());

        System.out.println();
        System.out.println("normalCar decelerating");
        normalCar.decelerate(5);
        System.out.println(normalCar.getTypeName() + " speed: " + normalCar.getSpeed());

        System.out.println();
        System.out.println("sportsCar decelerating");
        sportsCar.decelerate(5);
        System.out.println(sportsCar.getTypeName() + " speed: " + sportsCar.getSpeed());

        System.out.println();
        System.out.println("Bus decelerating");
        bus.decelerate(5);
        System.out.println(bus.getTypeName() + " speed: " + bus.getSpeed());

    }
}
