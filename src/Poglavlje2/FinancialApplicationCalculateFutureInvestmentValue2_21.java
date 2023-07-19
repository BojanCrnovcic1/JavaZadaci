package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCalculateFutureInvestmentValue2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos ulaganja : ");
        double iznosUlaganja = input.nextDouble();
        System.out.println("Unesite godisnju kamatnu stopu : ");
        double godisnjaKamatnaStopa = input.nextDouble();
        double mjesecnaKamatnaStopa = godisnjaKamatnaStopa / 1200;
        System.out.println("Unesite broj godina : ");
        int brojGodina = input.nextInt();

        double buducaInvesticionaVrijednost =
                iznosUlaganja * Math.pow(1 + mjesecnaKamatnaStopa,brojGodina * 12);

        System.out.println("Akumulirana vrijednost je : " + buducaInvesticionaVrijednost);
    }
}
