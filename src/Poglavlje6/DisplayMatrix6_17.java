package Poglavlje6;

import java.util.Scanner;

public class DisplayMatrix6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite velicinu matrixa : ");
        int matrix = input.nextInt();

        printMatrix(matrix);
    }
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int broj = (int) (Math.random() * 2);
                System.out.print(broj + " ");
            }
            System.out.println();
        }
    }
}
