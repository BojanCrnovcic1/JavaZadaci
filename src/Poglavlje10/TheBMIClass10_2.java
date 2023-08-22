package Poglavlje10;

import Klase.BMI;

public class TheBMIClass10_2 {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Ana",23,60,175.5);
        BMI bmi2 = new BMI("Petar",34,76,6,4);

        System.out.println("BMI 1# \nIme : " + bmi1.getIme() + "\nGodine : " + bmi1.getGodine() + "" +
                "\nBMI : " + bmi1.getBMI() + "\nStatus : " + bmi1.getStatus() + "\n");
        System.out.println("BMI 2# \nIme : " + bmi2.getIme() + "\nGodine : " + bmi2.getGodine() + "" +
                "\nBMI : " + bmi2.getBMI() + "\nStatus : " + bmi2.getStatus());
    }
}
