package Poglavlje5;

import java.util.Scanner;

public class ProcessString5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite string : ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i+=2) {
            System.out.print(string.charAt(i));
        }
    }
}
