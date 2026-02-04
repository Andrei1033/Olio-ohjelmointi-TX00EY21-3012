package tasks_1_2_SportsCar_Bus;

public class Bus extends Car{
    private int pasangers = 0;
    private int maxPasangers;

    public Bus(String typeName, double initialSpeed, double initialGasolineLevel, int maxPasangers) {
        super(typeName, initialSpeed, initialGasolineLevel);
        this.maxPasangers = maxPasangers;

    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            // better acceleration
            speed += 5;
            gasolineLevel -= 2;
        } else {
            speed = 0;
        }
    }

    @Override
    void decelerate(int amount){
        if (getGasolineLevel() > 0 && amount > 0) {
            speed = Math.max(0, speed - amount);
            gasolineLevel -= 1;
        }
        else {
            speed = 0;
        }
    }

    public void passengerEnter(){
        if(pasangers < maxPasangers){
            pasangers++;
        }
        else{
            System.out.println("Bus is full");
        }
    }

    public void passengerExit(){
        if(pasangers > 0){
            pasangers--;
        }
        else{
            System.out.println("Bus is empty");
        }
    }

    public int getPassengers() {
        return pasangers;
    }

}
