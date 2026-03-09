public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    // your code here
    private Color color;
    private boolean capOn;

    // default constructor
    public Pen() {
        this.color = Color.RED;
        this.capOn = true;
    }

    // constructor with color
    public Pen(Color color) {
        this.color = color;
        this.capOn = true;
    }

    public void capOn() {
        this.capOn = true;
    }
    public void capOff() {
        this.capOn = false;
    }

    public String draw() {
        if (this.capOn) {
            return "";
        }
        return "Drawing " + color;
    }

    public void changeColor(Color newColor) {
        if (capOn) {
            this.color = newColor;
        }
    }
}