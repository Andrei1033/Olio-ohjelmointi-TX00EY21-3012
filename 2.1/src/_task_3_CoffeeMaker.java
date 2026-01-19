public class _task_3_CoffeeMaker {
    public static void main(String[] args) {
        CoffeMaker coffeMaker = new CoffeMaker();

        //turn on
        coffeMaker.pressOnOff();
        System.out.println("Coffee maker is on");

        coffeMaker.setCoffeeType("espresso");
        coffeMaker.setCoffeeAmount(50);

        System.out.println("Coffee type is " + coffeMaker.getCoffeeType());
        System.out.println("Coffee amount is " + coffeMaker.getCoffeeAmount() + "ml");

        coffeMaker.pressOnOff();
        System.out.println("Coffee maker is off");
    }
}

class CoffeMaker{
    private boolean on;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeMaker() {
        on = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }

    public void setCoffeeType(String type) {
        if (on){
            if (coffeeType.equals("normal")) {
                coffeeType = type;
            }
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeAmount(int amount) {
        if (on){
            if (amount >= 10 && amount <= 80){
                coffeeAmount = amount;
            }
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}