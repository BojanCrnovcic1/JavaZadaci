package Poglavlje5;

public class ConversionFromKilogramsToPounds5_3 {
    public static void main(String[] args) {

        final double RAZLIKA = 2.2;

        System.out.println("Kilograms\t\tPounds");
        for (int i = 1; i <= 199; i+=2) {
            System.out.println(i + "\t\t\t\t" + (i * RAZLIKA));
        }
    }
}
