package Poglavlje11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Unesite listu : ");
        for (int i = 0; i < 5; i++) {
            lista.add(input.nextInt());
        }

        sort(lista);
        System.out.print("Sortirana lista : " + lista.toString());

    }
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
