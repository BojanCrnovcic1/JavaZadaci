package Poglavlje4;

public class GenerateVehiclePlateNumbers4_25 {
    public static void main(String[] args) {
        System.out.println("Random vozacke tablice ");

        int karakter1 = 65 + (int) (Math.random() * (90 - 65));
        int karakter2 = 65 + (int) (Math.random() * (90 - 65));
        int karakter3 = 65 + (int) (Math.random() * (90 - 65));
        int broj1 = (int) (Math.random() * 10);
        int broj2 = (int) (Math.random() * 10);
        int broj3 = (int) (Math.random() * 10);
        int broj4 = (int) (Math.random() * 10);

        System.out.println(""+(char)karakter1+(char)karakter2+(char)karakter3+broj1+broj2+broj3+broj4);

    }
}
