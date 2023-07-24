package Poglavlje5;

import java.util.Scanner;

public class GameScissorRockPaper5_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userWin = 0;
        int compWin = 0;
        int user;
        int comp;

        while (userWin != 2 && compWin != 2) {
            System.out.println("Unesite : kamen -> 0 , papir -> 1 , makaze -> 2 ");
            user = input.nextInt();
            System.out.print("Igrac igra ");
            switch (user) {
                case 0 : {
                    System.out.print("kamen. ");
                }break;
                case 1 : {
                    System.out.print("papir. ");
                }break;
                case 2 : {
                    System.out.print("makaze. ");
                }break;
                default:
                    System.out.println("Pogresan unos. ");
            }

            comp = (int) (Math.random() * 3);

            System.out.print("Kompjuter igra ");
            switch (comp) {
                case 0 : {
                    System.out.print("kamen. ");
                }break;
                case 1 : {
                    System.out.print("papir. ");
                }break;
                case 2 : {
                    System.out.print("makaze. ");
                }break;
            }

            if (user == comp) {
                System.out.print("Igra je nerijesena.");
            }
            else {
                boolean win = (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1);
                if (win) {
                    System.out.print("Vi ste pobjedili ! ");
                    userWin++;
                }
                else {
                    System.out.print("Kompjuter je pobjedio. ");
                    compWin++;
                }
            }
            System.out.println("\nPobjede  " +
                    "\nIgrac : " + userWin + "" +
                    "\nKompjuter : " + compWin);
        }

    }
}
