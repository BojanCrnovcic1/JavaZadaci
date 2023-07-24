package Poglavlje5;

public class DisplayTheASCIICharacterTable5_15 {
    public static void main(String[] args) {

        int count = 0;
//33 126
        System.out.println("ASCII tabla od ! do ~ ");

        for (int i = 33; i <= 126; i++) {
            System.out.print((char)i + " " );
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }

    }
}
