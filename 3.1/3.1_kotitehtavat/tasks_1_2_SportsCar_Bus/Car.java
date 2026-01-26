package tasks_1_2_SportsCar_Bus;

public class Car {
    protected double speed;
    protected double gasolineLevel;
    private String typeName;


    // cruise control
    private boolean cruiseOn;
    private double cruiseTargetSpeed;

    private static final double MIN_CRUISE_SPEED = 40;
    private static final double MAX_CRUISE_SPEED = 130;

    public Car(String typeName,  double initialSpeed, double initialGasolineLevel) {
        this.typeName = typeName;
        this.speed = initialSpeed; //aloitusnopeus
        this.gasolineLevel = initialGasolineLevel; //aloituspolttoainemäärä / tankin kapasiteetti
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 1;
        }
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    //* Cruise Control start

    public void setCruiseTargetSpeed (double speed){
        this.cruiseTargetSpeed = speed;
    }

    public double getCruiseTargetSpeed() {
        return cruiseTargetSpeed;
    }

    public boolean turnCruiseControlOn() {
        if (cruiseTargetSpeed < MIN_CRUISE_SPEED ||
                cruiseTargetSpeed > MAX_CRUISE_SPEED ||
                gasolineLevel <= 0) {

            cruiseOn = false;
            return false;
        }

        cruiseOn = true;
        return true;
    }

    public void turnCruiseControlOff() {
        cruiseOn = false;
    }

    public void updateCruiseControl() {
        if (!cruiseOn)
            return;

        if (gasolineLevel <= 0) {
            cruiseOn = false;
            System.out.println("Cruise control turned off: no fuel");
            return;
        }

        if (speed < cruiseTargetSpeed) {
            accelerate();
        } else if (speed > cruiseTargetSpeed) {
            decelerate(10);
        }
    }
    //* Cruise Control end

    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}
