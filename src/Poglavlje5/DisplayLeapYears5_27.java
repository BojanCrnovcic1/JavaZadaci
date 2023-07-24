package Poglavlje5;

public class DisplayLeapYears5_27 {
    public static void main(String[] args) {
        System.out.println("Prestupne godine od 101 do 2100 : ");

        int count = 0;

        for (int i = 101; i <= 2100; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + " ");
                count++;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
