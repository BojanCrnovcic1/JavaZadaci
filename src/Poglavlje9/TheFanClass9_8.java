package Poglavlje9;

import Klase.Fan;

public class TheFanClass9_8 {
    public static void main(String[] args) {

        Fan ventilator1 = new Fan();
        Fan ventilator2 = new Fan();

        ventilator1.setSpeed(Fan.FAST);
        ventilator1.setRadius(10);
        ventilator1.setColor("zuta");
        ventilator1.isOn();

        ventilator2.setSpeed(Fan.MEDIUM);
        ventilator2.setRadius(5);
        ventilator2.setColor("plava");
        ventilator2.isOff();

        System.out.println(ventilator1.toString() + "\n");
        System.out.println(ventilator2.toString());
    }
}
