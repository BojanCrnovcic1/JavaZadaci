package Poglavlje5;

public class ConversionFromMilesToKilometers5_6 {
    public static void main(String[] args) {

        final double RAZLIKA = 1.609;

        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j+=5) {
            System.out.println(i+"\t\t\t"+(i*RAZLIKA)+"\t\t|\t"+j+"\t\t\t\t"+(j/RAZLIKA));
        }
    }
}
