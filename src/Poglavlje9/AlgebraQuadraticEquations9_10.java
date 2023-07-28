package Poglavlje9;

import Klase.QuadraticEquation;

import java.util.Scanner;

public class AlgebraQuadraticEquations9_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation jednacina = new QuadraticEquation(a,b,c);

        System.out.print("Jednacina ");
        if (jednacina.getDiscriminant() < 0) {
            System.out.println("nema korijen. ");
        }
        else if (jednacina.getDiscriminant() > 0) {
            System.out.println("ima dva korijena : " + jednacina.getRoot1() + " i " + jednacina.getRoot2());
        }
        else
            System.out.println("ime jedan korijen : " + ((jednacina.getRoot1() > 0) ?
                    jednacina.getRoot1() : jednacina.getRoot2()));
    }
}
