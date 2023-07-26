package Poglavlje7;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedLists7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] lista1 = new int[6];
        int[] lista2 = new int[5];

        System.out.println("Unesite prvu listu : ");
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = input.nextInt();
        }
        System.out.println("Unesite drugu listu : ");
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = input.nextInt();
        }
        System.out.print("Ujedinjena lista : ");
        ispisListe(merge(lista1,lista2));

    }
    public static int[] merge(int[] list1, int[] list2) {
        int dveListe = list1.length + list2.length;
        int[] rezultat = new int[dveListe];
        for (int i = 0; i < list1.length; i++) {
            rezultat[i] += list1[i];
        }
        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            rezultat[j] += list2[i];
            }
        Arrays.sort(rezultat);
        return rezultat;
    }

    public static void ispisListe(int[] list) {
        for (int e : list) {
            System.out.print(e + " ");
        }
    }
}
