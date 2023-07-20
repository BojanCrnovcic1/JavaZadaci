package Poglavlje3;

import java.util.Scanner;

public class SortThreeIntegers3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite 3 integera : ");
        int broj1 = input.nextInt();
        int broj2 = input.nextInt();
        int broj3 = input.nextInt();

        int temp;
        if (broj2 > broj1 || broj3 > broj1) {
            if (broj2 > broj1) {
                temp = broj1;
                broj1 = broj2;
                broj2 = temp;
            }
            if (broj3 > broj1) {
                temp = broj1;
                broj1 = broj3;
                broj3 = temp;
            }
        }
        if (broj3 > broj2) {
            temp = broj2;
            broj2 = broj3;
            broj3 = temp;
        }
        System.out.println("Raspored integera od veceg prema manjem : "+broj1+" "+broj2+" "+broj3);
    }

}
