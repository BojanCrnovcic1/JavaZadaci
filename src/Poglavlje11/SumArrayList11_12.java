package Poglavlje11;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Unesite listu : ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("Zbir elemenata u listi je : " + sum(list));

    }
    public static double sum(ArrayList<Double> list) {
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
