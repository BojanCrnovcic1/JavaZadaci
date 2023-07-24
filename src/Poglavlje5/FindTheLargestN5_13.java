package Poglavlje5;

public class FindTheLargestN5_13 {
    public static void main(String[] args) {

        int n = 0;

        while ((Math.pow(n + 1,3)) < 12000) {
            n++;
        }
        System.out.println("Najvece n3 je : " + n);
    }
}
