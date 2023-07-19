package Poglavlje2;

import java.util.Scanner;

public class ComputeTheVolumeOfACylinder2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite radius i duzinu cilindra : ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("Povrsina : " + area + "\nZapremina : " + volume);

    }
}
