package Poglavlje3;

import java.util.Scanner;

public class FindFutureDates3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite danasnji dan : ");
        int dan = input.nextInt();
        System.out.println("Unesite koliko je dana proslo od danasnjeg dana : ");
        int prosloVrijeme = input.nextInt();

        System.out.print("Danas je ");

        switch (dan) {
            case 0 : {
                System.out.print("Nedelja");
            }break;
            case 1 : {
                System.out.print("Ponedeljak");
            }break;
            case 2 : {
                System.out.print("Utorak");
            }break;
            case 3 : {
                System.out.print("Sreda");
            }break;
            case 4 : {
                System.out.print("Cetvrtak");
            }break;
            case 5 : {
                System.out.print("Petak");
            }break;
            case 6 : {
                System.out.print("Subota");
            }break;
            default:
                System.out.println("Pogresan unos. ");
        }


        int buduciDan = (dan + prosloVrijeme) % 7;

        System.out.print(" a buduci dan je ");

        switch (buduciDan) {
            case 0 : {
                System.out.print("Nedelja");
            }break;
            case 1 : {
                System.out.print("Ponedeljak");
            }break;
            case 2 : {
                System.out.print("Utorak");
            }break;
            case 3 : {
                System.out.print("Sreda");
            }break;
            case 4 : {
                System.out.print("Cetvrtak");
            }break;
            case 5 : {
                System.out.print("Petak");
            }break;
            case 6 : {
                System.out.print("Subota");
            }break;
        }

    }
}
