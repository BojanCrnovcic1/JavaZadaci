package Poglavlje3;

import java.util.Scanner;

public class AlgebraSolve2X2LinearEquations3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite a, b, c, d, e i f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double X = (e * d - b * f) / (a * d - b * c);
        double Y = (a * f - e * c) / (a * d - b * c);

        if (a * d - b * c == 0) {
            System.out.println("Jednacina nema rjesenje. ");
        } else
            System.out.println("x je : " + X + " y je : " + Y);
    }
}
