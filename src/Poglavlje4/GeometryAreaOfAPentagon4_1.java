package Poglavlje4;

import java.util.Scanner;

public class GeometryAreaOfAPentagon4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite duzinu od centra do vartexa : ");
        double duzina = input.nextDouble();

        double s = (2 * duzina * Math.sin(Math.PI / 5));

        double area = (5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("Povrsina pentagona je : " + area);
    }
}
