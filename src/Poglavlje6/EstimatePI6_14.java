package Poglavlje6;

public class EstimatePI6_14 {
    public static void main(String[] args) {
        System.out.println("i\t\t\t\t\tm(i)");

        for (int i = 1; i <= 901; i+=100) {
            System.out.println(i+"\t\t\t\t\t"+m(i));
        }
    }
    public static double m(double n) {
        double PI = 0;
        for (double i = 1; i <= n; i++) {
            PI += Math.pow(-1,i + 1) / (2 * i - 1);
        }
        PI *= 4;
        return PI;
    }
}
