package Poglavlje9;

import Klase.LinearEquation;

import java.util.Scanner;

public class Algebra2X2LinearEquations9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation jednacina = new LinearEquation(a,b,c,d,e,f);

        if (jednacina.isSolvable()) {
            System.out.println("X je : " + jednacina.getX() + "\n Y je : " + jednacina.getY());
        }
        else
            System.out.println("Jednacina nema rijesenje. ");
    }
}
