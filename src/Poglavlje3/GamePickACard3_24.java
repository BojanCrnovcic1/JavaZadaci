package Poglavlje3;

import java.util.Scanner;

public class GamePickACard3_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vrjednost = (int) (Math.random() * 13) + 1;
        int znak = (int) (Math.random() * 4) + 1;

        System.out.print("Karta koju ste izvukli je ");

        switch (vrjednost) {
            case 1 : {
                System.out.print("AS");
            }break;
            case 2 : {
                System.out.print("2");
            }break;
            case 3 : {
                System.out.print("3");
            }break;
            case 4 : {
                System.out.print("4");
            }break;
            case 5 : {
                System.out.print("5");
            }break;
            case 6 : {
                System.out.print("6");
            }break;
            case 7 : {
                System.out.print("7");
            }break;
            case 8 : {
                System.out.print("8");
            }break;
            case 9 : {
                System.out.print("9");
            }break;
            case 10 : {
                System.out.print("10");
            }break;
            case 11 : {
                System.out.print("Zandar");
            }break;
            case 12 : {
                System.out.print("Kraljica");
            }break;
            case 13 : {
                System.out.print("Kralj");
            }break;
        }
        switch (znak) {
            case 1 : {
                System.out.print(" Pik");
            }break;
            case 2 : {
                System.out.print(" Herc");
            }break;
            case 3 : {
                System.out.print(" Tref");
            }break;
            case 4 : {
                System.out.print(" Karo");
            }break;
        }
    }
}
