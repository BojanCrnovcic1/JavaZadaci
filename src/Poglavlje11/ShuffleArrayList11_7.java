package Poglavlje11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList11_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Unesite listu : ");
        for (int i = 0; i < 6; i++) {
            list.add(input.nextInt());
        }

        shuffle(list);

        System.out.println("Izmjesana lista : " + list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
