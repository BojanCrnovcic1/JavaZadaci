package Poglavlje7;

import java.util.Scanner;

public class SortStudents7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj studenata : ");
        String[] studenti = new String[input.nextInt()];
        int[] rezultati = new int[studenti.length];

        for (int i = 0; i < studenti.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            studenti[i] = input.next();
            System.out.print("Rezultat : ");
            rezultati[i] = input.nextInt();
        }

        sort(studenti,rezultati);

        for (String str : studenti) {
            System.out.println(str);
        }
    }
    public static void sort(String[] str, int[] numb) {
        for (int i = 0; i < numb.length; i++) {
            int max = numb[i];
            int indexMax = i;
            String temp;
            for (int j = i + 1; j < numb.length; j++) {
                if (numb[j] > max) {
                    max = numb[j];
                    indexMax = j;
                }
            }
            if (indexMax != i) {
                temp = str[i];
                str[i] = str[indexMax];
                str[indexMax] = temp;

                numb[indexMax] = i;
                numb[i] = max;
            }
        }
    }
}
