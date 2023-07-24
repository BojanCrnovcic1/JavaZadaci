package Poglavlje5;

public class MathCombinations5_43 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("Sve kombinacije brojeva od 1 do 7 : ");

        for (int i = 1; i < 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i+"\t\t"+j);
                count++;
            }
        }
        System.out.println("Broj svih kombinacija je : " +  count);

    }
}
