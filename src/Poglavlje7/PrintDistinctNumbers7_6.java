package Poglavlje7;

import java.util.Scanner;

public class PrintDistinctNumbers7_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] niz = new int[10];
        int count = 0;
        int broj;

        System.out.println("Unesite 10 brojeva u niz : ");
        for (int i = 0; i < niz.length; i++) {
            broj = input.nextInt();
            if (ignorisanjePonavljanja(niz,broj)) {
                niz[count] = broj;
                count++;
            }
        }
        System.out.println("Razliciti brojevi u nizu : " + count);
        System.out.print("Niz razlicitih brojeva : ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > 0) {
                System.out.print(niz[i] + " ");
            }
        }
    }

    public static boolean ignorisanjePonavljanja(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return false;
            }
        }
       return true;
    }
}
