package Poglavlje4;

import java.util.Scanner;

public class ConvertLetterGradeToNumber4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ocjenu kao slovo : ");
        String slovoOcjenaS = input.next();
        char slovo = slovoOcjenaS.charAt(0);

        switch (slovo) {
            case 'A': {
                System.out.println("Numericka vrijednost ocjene " + slovo + " je 5.");
            }break;
            case 'B': {
                System.out.println("Numericka vrijednost ocjene " + slovo + " je 4.");
            }break;
            case 'C': {
                System.out.println("Numericka vrijednost ocjene " + slovo + " je 3.");
            }break;
            case 'D': {
                System.out.println("Numericka vrijednost ocjene " + slovo + " je 2.");
            }break;
            case 'F': {
                System.out.println("Numericka vrijednost ocjene " + slovo + " je 1.");
            }break;
            default:
                System.out.println(slovo + " je pogresan unos. ");
        }
    }
}
