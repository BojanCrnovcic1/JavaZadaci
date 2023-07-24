package Poglavlje5;

public class ConversionFromKilogramsToPoundsAndPoundsToKilograms5_5 {
    public static void main(String[] args) {

        final double RAZLIKA = 2.2;

        System.out.println("Kilograms\t\tPounds\t|\tPounds\t\tKilogramas");
        for (int i = 1, j = 20; i <= 199 && j <= 515; i+=2,j+=5) {
            System.out.println(i+"\t\t\t\t"+(i*RAZLIKA)+"\t\t|\t\t"+j+"\t\t\t\t"+(j/RAZLIKA));
        }
    }
}
