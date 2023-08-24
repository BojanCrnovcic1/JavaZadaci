package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Unesite listu od 10 integera : ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);
        System.out.println("Lista bez duplikata : " + list.toString());
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}
