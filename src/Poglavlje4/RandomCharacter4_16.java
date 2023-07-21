package Poglavlje4;

public class RandomCharacter4_16 {
    public static void main(String[] args) {

        int karakter = 65 + (int) (Math.random() * (90 - 65));

        System.out.println("Random karakter velikog slova : " + (char)karakter);
    }
}
