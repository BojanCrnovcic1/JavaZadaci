package Poglavlje6;

public class GameChanceOfWinningAtCraps6_32 {
    public static void main(String[] args) {

        brojPobjeda();
    }

    private static void brojPobjeda() {
        int countWin = 0;
        for (int i = 0; i < 10000; i++) {
            if (pobjeda()) {
                countWin++;
            }
        }
        System.out.println("Broj pobjeda u 10000 igara je : " + countWin);
    }
    private static void ispisIgre() {
        if (pobjeda()) {
            System.out.println("Vi ste pobjedili.");
        }
        else
            System.out.println("Vi ste izgubili. ");
    }

    private static boolean pobjeda() {
        int suma = sumaBacanja();
        if (suma == 2 || suma == 3 || suma == 12) {
            System.out.println("Craps!");
            return false;
        }
        if (suma == 7 || suma == 11) {
            System.out.println("Natural!");
            return true;
        }
        return point(suma);
    }

    private static boolean point(int point) {
        System.out.println("Point : " + point);
        while (true) {
            int suma = sumaBacanja();
            if (suma == 7) {
                return false;
            }
            if (suma == point) {
                return false;
            }
        }
    }

    private static int sumaBacanja() {
        int kockica1 = kockica();
        int kockica2 = kockica();
        System.out.println("Suma bacanja je : " + (kockica1 + kockica2));
        return kockica1 + kockica2;
    }

    private static int kockica() {
        return (int) (Math.random() * 6) + 1;
    }
}
