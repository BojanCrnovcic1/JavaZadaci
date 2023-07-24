package Poglavlje5;

public class ConversionFromMilesToKilometers5_4 {
    public static void main(String[] args) {

        final double RAZLIKA = 1.609;

        System.out.println("Miles\t\t\tKilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t\t\t" + (i * RAZLIKA));
        }
    }
}
