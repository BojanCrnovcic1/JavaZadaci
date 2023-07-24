package Poglavlje5;

import java.util.Scanner;

public class CountPositiveAndNegativeNumbersAndComputeTheAverageOfNumbers5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        int positivNum = 0;
        int negativNum = 0;
        System.out.println("Unosite brojeve dok ne unesete 0 : ");
        int broj = input.nextInt();
        if (broj == 0) {
            System.out.println("Nema brojeva, unijeli ste prvo "+broj);
        }else
        {
            while (broj != 0) {
                if (broj > 0) {
                    positivNum++;
                }
                else {
                    negativNum++;
                }

                sum+=broj;
                count++;
                broj = input.nextInt();
            }
        }

        System.out.println("Broj pozitivnih brojeva : " + positivNum + "" +
                "\nBroj negativnih brojeva : " + negativNum + "" +
                "\nUkupan zbor brojeva : " + sum + "" +
                "\nProsjek brojeva : " + (sum / count));
    }
}
