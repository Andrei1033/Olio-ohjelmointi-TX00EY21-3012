public class _task_4CarDriver {
    public static void main(String[] args) {
        _task_2Car myCar = new _task_2Car("Toyota Corolla", 60, 1);

        myCar.fillTank();

        System.out.println(myCar.getTypeName() + " initial speed: " + myCar.getSpeed());

        myCar.setCruiseTargetSpeed(100);

        if (myCar.turnCruiseControlOn()){
            System.out.println("Cruise control ON at "
                    + myCar.getCruiseTargetSpeed() + " km/h");
        }
        else {
            System.out.println("Cruise control could not be activated");
        }

        // Cruise control driving
        for (int i = 0; i < 6; i++) {
            myCar.updateCruiseControl();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.turnCruiseControlOff();
        System.out.println("Cruise control OFF");

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}