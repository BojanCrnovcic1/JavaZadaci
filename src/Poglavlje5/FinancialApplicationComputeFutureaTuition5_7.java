package Poglavlje5;

public class FinancialApplicationComputeFutureaTuition5_7 {
    public static void main(String[] args) {

        double skolarina = 1000;
        double kamata = 0.05;
        double skolarina10godina = 0;
        double finalSkolarina = 0;

        for (int i = 1; i <= 14; i++) {
            skolarina += (skolarina * kamata);

            if (i == 10) {
                skolarina10godina += skolarina;
            }
            if (i > 10) {
                finalSkolarina += skolarina;
            }
        }
        System.out.println("Cijena skolarine nakon 10 godina : $"+skolarina10godina + "" +
                "\nCijena skolarine nakon dodatne 4 godine : $"+finalSkolarina);
    }
}
