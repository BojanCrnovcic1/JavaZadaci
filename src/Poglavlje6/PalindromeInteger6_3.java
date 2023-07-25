package Poglavlje6;

import java.util.Scanner;

public class PalindromeInteger6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite integer : ");
        int broj = input.nextInt();

        if (isPalindrome(broj)) {
            System.out.println("Broj je palindrom. ");
        }
        else
            System.out.println("Broj nije palidnrom.");
    }

    public static boolean isPalindrome(int number) {
        if (number != reverse(number)) {
            return false;
        }
        return true;
    }
    public static int reverse(int number) {
        String numb = "";
        String obrnuto = number + "";
        for (int i = obrnuto.length() - 1; i >= 0; i--) {
            numb += obrnuto.charAt(i);
        }
        return Integer.parseInt(numb);
    }
}
