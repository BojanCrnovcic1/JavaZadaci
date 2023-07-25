package Poglavlje6;

public class ConversionsBetweenFeetAndMeters6_9 {
    public static void main(String[] args) {

        System.out.println("Feet\t\tMeters\t|\tMeters\t\tFeet");

        for (double i = 1.0, j = 20.0; i <= 10.0 && j <= 65.0; i++, j+=5) {
            System.out.println(i+"\t\t\t"+footToMeter(i)+"\t|\t"+j+"\t\t"+meterToFoot(j));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
