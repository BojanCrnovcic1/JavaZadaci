package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationCompoundValue5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos ustede : ");
        double iznosUstede = input.nextDouble();
        System.out.println("Unesite godisnju kamatnu stopu : ");
        double godisnjaKamatnaStopa = input.nextDouble();
        double mjesecnaKamata = godisnjaKamatnaStopa / 1200;
        System.out.println("Unesite broj mjeseci :");
        int mjesec = input.nextInt();

        double mjesecnaUsteda = 0;

        System.out.println("Mjesec#\t\t\tUsteda");
        for (int i = 1; i <= mjesec; i++) {
            mjesecnaUsteda = (iznosUstede + mjesecnaUsteda) * (1 + mjesecnaKamata);

            System.out.println(i+"\t\t\t\t"+mjesecnaUsteda);
        }


    }
}
