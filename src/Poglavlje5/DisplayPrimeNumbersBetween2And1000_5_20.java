package Poglavlje5;

public class DisplayPrimeNumbersBetween2And1000_5_20 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Prime brojevi izmedju 2 i 1000 :");

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int djeljiv = 2; djeljiv <= i / 2; djeljiv++) {
                if (i % djeljiv == 0) {
                    isPrime = false;
                    break;
                }

                if (isPrime) {
                    System.out.print(i + " ");
                    count ++;
                }
                if (count == 8) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
