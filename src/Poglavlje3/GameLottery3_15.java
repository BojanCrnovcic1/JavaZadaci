package Poglavlje3;

import java.util.Scanner;

public class GameLottery3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------L O T O--------");

        int loto = (int) (Math.random() * 1000);
        int lotoCifra1 = loto / 100;
        int ostatak = loto % 100;
        int lotoCifra2 = ostatak / 10;
        int lotoCifra3 = ostatak % 10;

        System.out.println("Unesite loto broj od tri cifre : ");
        int user = input.nextInt();

        int igracCifra1 = user / 100;
        int ostatakUser = user % 100;
        int igracCifra2 = user / 10;
        int igracCifra3 = user % 10;

        System.out.println("Loto broj je : " + loto);

        if (loto == user) {
            System.out.println("Osvojili ste $10000!");
        }
        else if (lotoCifra1 == igracCifra2 && lotoCifra1 == igracCifra3 &&
        lotoCifra2 == igracCifra1 && lotoCifra2 == igracCifra3 &&
        lotoCifra3 == igracCifra1 && lotoCifra3 == igracCifra1) {
            System.out.println("Osvojili ste $3000!");
        }
        else if (lotoCifra1 == igracCifra1 || lotoCifra1 == igracCifra2 || lotoCifra1 == igracCifra3 ||
        lotoCifra2 == igracCifra1 || lotoCifra2 == igracCifra2 || lotoCifra2 == igracCifra3 ||
        lotoCifra3 == igracCifra1 || lotoCifra3 == igracCifra2 || lotoCifra3 == igracCifra3) {
            System.out.println("0svojili ste $1000!");
        }
        else
            System.out.println("Bez dobitka.");


    }
}
