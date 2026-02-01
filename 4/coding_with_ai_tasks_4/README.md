# Calculator Application

## Idea of the Program

This project contains a simple Calculator class that can sum positive integers.
The calculator follows the Model role of the MVC pattern and stores the current
calculation state internally.

Negative integers are not allowed and will cause an exception.

## Calculator Class

```java
public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void reset() {
        value = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        value += number;
    }

    public int getValue() {
        return value;
    }
}
