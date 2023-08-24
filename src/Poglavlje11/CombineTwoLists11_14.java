package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists11_14 {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        System.out.println("Unesite 5 integera u listu 1 : ");
        ispisListe(lista1);
        System.out.println("Unesite 5 integera u listu 2 : ");
        ispisListe(lista2);

        System.out.println("Ujedinjena lista je : " + union(lista1,lista2));
    }

    public static void ispisListe(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

}
