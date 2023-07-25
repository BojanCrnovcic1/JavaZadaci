package Poglavlje6;

public class NumberOfDaysInAYear6_16 {
    public static void main(String[] args) {

        System.out.println("Broj dana u svakoj godini od 2000 do 2020 : ");

        for (int i = 2000; i <= 2020; i++) {
            System.out.println("Godina " + i + " ima " + numberOfDaysInAYear(i) + " dana u godini. ");
        }

    }
    public static int numberOfDaysInAYear(int year) {
        int brojDana = 0;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            brojDana += 366;
        }
        else
            brojDana += 365;

        return brojDana;
    }
}
