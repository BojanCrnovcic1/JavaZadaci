package Poglavlje2;

import java.util.Scanner;

public class PhysicsFindingRunwayLength2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite brzinu i ubrzanje ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed,2) / (2 * acceleration);

        System.out.println("Minimalna duzina staze za uzlet ovog aviona je : " + length);
    }
}
