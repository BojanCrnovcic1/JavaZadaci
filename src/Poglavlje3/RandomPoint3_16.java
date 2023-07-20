package Poglavlje3;

import java.util.Random;

public class RandomPoint3_16 {
    public static void main(String[] args) {
        Random random = new Random();

        int sirina = random.nextInt(100);
        int visina = random.nextInt(200);

        System.out.println(sirina+","+visina);
    }
}
