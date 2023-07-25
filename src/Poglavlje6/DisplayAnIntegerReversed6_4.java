package Poglavlje6;

import java.util.Scanner;

public class DisplayAnIntegerReversed6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj : ");
        int broj = input.nextInt();

        reverse(broj);
    }
    public static void reverse(int number) {
        String numb = "";
        String reverse = number + "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            numb += reverse.charAt(i);
        }
        System.out.print(Integer.parseInt(numb));
    }
}
