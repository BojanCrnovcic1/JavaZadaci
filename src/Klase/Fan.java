package Klase;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "plava";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void isOn() {
        on = true;
    }

    public void isOff() {
        on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on == true) {
           return "\nBrzina : " + speed +
                   "\nBoja : " + color +
                   "\nRadius : " + radius;
        }
        else
            return "\nBoja : " + color +
                    "\nRadius : " + radius +
                    "\nVentilator je iskljucen. ";
    }
}
