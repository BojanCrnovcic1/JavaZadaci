package Poglavlje3;

import java.util.Scanner;

public class GameHeadsOrTails3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Izaberite glavu ( 0 ) ili pismo ( 1 ) : ");
        int igrac = input.nextInt();

        System.out.print("Novcic je pao na ");
        int novcic = (int) (Math.random() * 2);

        switch (igrac) {
            case 0 : {
                if (novcic == 0) {
                    System.out.print("glavu. Pogodili ste. ");
                }
                else if (novcic == 1) {
                    System.out.print("pismo. Niste pogodili.");
                }
            }break;
            case 1 : {
                if (novcic == 0) {
                    System.out.print("glavu. Niste pogodili.");
                }
                else if (novcic == 1) {
                    System.out.print("Pismo. Pogodili ste. ");
                }
            }
        }
    }
}
