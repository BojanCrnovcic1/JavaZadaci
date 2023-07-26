package Poglavlje7;

import java.util.Scanner;

public class ReverseTheNumbersEntered7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] niz = new int[10];

        System.out.println("Unesite 10 brojeva : ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = input.nextInt();
        }

        reverse(niz);
    }

    public static void reverse(int[] array) {
        System.out.print("Obrnuti niz je : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
    }
}
