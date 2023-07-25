package Poglavlje6;

import java.util.Scanner;

public class SumTheDigitsInAnInteger6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj :");
        long broj = input.nextLong();

        System.out.println("Zbir unesenih brojeva je : " + sumDigits(broj));

    }
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
