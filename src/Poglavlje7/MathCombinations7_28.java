package Poglavlje7;

import java.util.Scanner;

public class MathCombinations7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] niz = new int[10];

        System.out.println("Ispunite niz brojevima : ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        System.out.println("Sve kombinacije unesenih brojeva : ");
        sveKombinacije(niz);
    }

    public static void sveKombinacije(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.println(list[i]+ " " + list[j]);
            }
        }
    }
}
