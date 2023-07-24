package Poglavlje5;

import java.util.Scanner;

public class FindTheHighestScore5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int najboljaOcjena = 0;
        String najboljiStudent = "";

        System.out.println("Unesite broj studenata : ");
        int brojStudenata = input.nextInt();

        for (int i = 0; i < brojStudenata; i++) {
            System.out.println("Student " + (i+1) + " : " +
                    "\nIme :");
            String ime = input.next();
            System.out.println("\nOcjena : ");
            int ocjena = input.nextInt();

            if (ocjena > najboljaOcjena) {
                najboljaOcjena = ocjena;
                najboljiStudent = ime;

            }
        }
        System.out.println("Student : " + najboljiStudent + " ima najvisu ocjenu : " + najboljaOcjena);
    }
}
