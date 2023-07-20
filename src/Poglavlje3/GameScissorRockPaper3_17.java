package Poglavlje3;

import java.util.Scanner;

public class GameScissorRockPaper3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int komp = (int) (Math.random() * 3);

        System.out.println("Unesite kamen -> 0 papir -> 1 ili makaze -> 2 : ");
        int user = input.nextInt();

        System.out.print("Kompjuter igra : ");
        switch (komp) {
            case 0 : {
                System.out.print("kamen");
            }break;
            case 1 : {
                System.out.print("papir");
            }break;
            case 2 : {
                System.out.print("makaze");
            }break;
        }

        System.out.print(". Vi igrate : ");
        switch (user) {
            case 0 : {
                if (komp == 0) {
                    System.out.print("kamen. Igra je nerijesena. ");
                }
                else if (komp == 1) {
                    System.out.print("kamen. Kompjuter je pobjedio. ");
                }
                else if (komp == 2) {
                    System.out.print("kamen. Vi ste pobjedili. ");
                }
            }break;
            case 1 : {
                if (komp == 0) {
                    System.out.print("papir. Vi ste pobjedili. ");
                }
                else if (komp == 1) {
                    System.out.print("papir. Igra je nerijesena. ");
                }
                else if (komp == 2) {
                    System.out.print("papir. Kompjuter je pobjedio. ");
                }
            }break;
            case 2 : {
                if (komp == 0) {
                    System.out.print("makaze. Kompjuter je pobjedio. ");
                }
                else if (komp == 1) {
                    System.out.print("makaze. Vi ste pobjedili. ");
                }
                else if (komp == 2) {
                    System.out.print("makaze. Igra je nerijesena. ");
                }
            }break;
            default:
                System.out.println("Pogresan unos.");
        }
    }
}

