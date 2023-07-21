package Poglavlje4;

import java.util.Scanner;

public class GeometryAreaOfARegularPolygon4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj strana : ");
        int n = input.nextInt();
        System.out.println("Unesite stranu : ");
        double side = input.nextDouble();

        double area = (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));

        System.out.println("Povrsina poligona je : " + area);
    }
}
