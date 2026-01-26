package tasks_1_2_SportsCar_Bus;

public class SportsCar extends Car {

    public SportsCar(String typeName, double initialSpeed, double initialGasolineLevel) {
        super(typeName, initialSpeed, initialGasolineLevel);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            // better acceleration
            speed += 20;
            gasolineLevel -= 2;
        } else {
            speed = 0;
        }
    }

    @Override
    void decelerate(int amount){
        if (getGasolineLevel() > 0 && amount > 0) {
            speed = Math.max(0, speed - amount * 2);
            gasolineLevel -= 1;
        }
        else {
            speed = 0;
        }
    }
}
