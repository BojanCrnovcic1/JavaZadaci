package Poglavlje5;

import java.util.Scanner;

public class ReverseAString5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string : ");
        String string = input.nextLine();

        System.out.println("Obrnuti string je ");
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
