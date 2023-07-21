package Poglavlje4;

import java.util.Scanner;

public class CheckSubstring4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi string : ");
        String prviString = input.nextLine();
        System.out.println("Unesite ddrugi string : ");
        String drugiString = input.nextLine();

        System.out.println(drugiString+(prviString.contains(drugiString)?" je ":" nije ")+"substring "+prviString);
    }
}
