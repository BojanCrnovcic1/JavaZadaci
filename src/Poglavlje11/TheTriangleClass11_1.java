package Poglavlje11;

import Klase.Triangle;

import java.util.Scanner;

public class TheTriangleClass11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite 3 strane trougla : ");
        double strana1 = input.nextDouble();
        double strana2 = input.nextDouble();
        double strana3 = input.nextDouble();

        System.out.println("Unesite boju : ");
        String boja = input.next();
        System.out.println("Unesite da li je  trouga ispunjen (true / false) : ");
        boolean ispunjen = input.nextBoolean();

        Triangle trougao = new Triangle(boja,ispunjen,strana1,strana2,strana3);

        System.out.println("Povrsina : " + trougao.getArea() + "" +
                "\nObim : " + trougao.getPerimeter() + "\nBoja : " + trougao.getColor() + "" +
                "\nIspunjenost : " + trougao.isFilled());
    }
}
