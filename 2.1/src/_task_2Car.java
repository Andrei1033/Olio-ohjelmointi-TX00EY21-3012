public class _task_2Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;

    public _task_2Car(String typeName,  double initialSpeed, double initialGasolineLevel) {
        this.typeName = typeName;
        this.speed = initialSpeed; //aloitusnopeus
        this.gasolineLevel = initialGasolineLevel; //aloituspolttoainemäärä / tankin kapasiteetti
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
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