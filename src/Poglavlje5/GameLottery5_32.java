package Poglavlje5;

import java.util.Scanner;

public class GameLottery5_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tL O T O\t\t\t");

        System.out.println("Unesite dvocifreni loto broj : ");
        int user = input.nextInt();

        int user1 = user / 10;
        int user2 = user % 10;

        int loto1 = (int) (Math.random() * 10);
        int loto2;
        do {
            loto2 = (int) (Math.random() * 10);

        }while (loto1 == loto2);
        System.out.println("Loto broj je : " + loto1 + loto2);

        if (user1 == loto1 && user2 == loto2) {
            System.out.println("Osvojili ste 10000$!");
        }
        else if (user1 == loto2 && user2 == loto1) {
            System.out.println("Osvojili ste 3000$!");
        }
        else if (user1 == loto1 || user1 == loto2 || user2 == loto1 || user2 == loto2) {
            System.out.println("Osvojili ste 1000$!");
        }
        else
            System.out.println("Bez dobitka.");
    }
}
