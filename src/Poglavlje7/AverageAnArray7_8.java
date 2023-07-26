package Poglavlje7;

import java.util.Scanner;

public class AverageAnArray7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] nizDouble = new double[10];
        int[] nizInteger = new int[10];

        System.out.println("Unesite 10 brojeva : ");
        for (int i = 0; i < nizDouble.length; i++) {
            nizDouble[i] = input.nextDouble();
            nizInteger[i] = (int) nizDouble[i];
        }
        System.out.println("Prosjek double brojeva : " + average(nizDouble));
        System.out.println("Prosjek integer brojeva : " + average(nizInteger));
    }
    public static double average(double[] array) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }
        return sum / count;
    }

    public static int average(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }
        return sum / count;
    }
}
