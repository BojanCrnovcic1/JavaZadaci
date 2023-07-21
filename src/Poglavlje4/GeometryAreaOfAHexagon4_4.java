package Poglavlje4;

import java.util.Scanner;

public class GeometryAreaOfAHexagon4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite stranu : ");
        double side = input.nextDouble();

        double area = (6 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("Povrsina heksagona : " + area);
    }
}
