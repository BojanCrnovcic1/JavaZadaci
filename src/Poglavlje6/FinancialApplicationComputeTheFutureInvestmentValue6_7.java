package Poglavlje6;

import java.util.Scanner;

public class FinancialApplicationComputeTheFutureInvestmentValue6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos pozajmice : ");
        double pozajmica = input.nextDouble();
        System.out.println("Unesite godisnju kamatnu stopu : ");
        double godisnjaKamatnaStopa = input.nextDouble();
        double mjesecnaKamtnaStopa = godisnjaKamatnaStopa / 1200;


        System.out.println("Godine\t\t\t\tBuduca Vrijednost");
        for (int i = 1; i <= 30; i++) {
            System.out.println(i+"\t\t\t"+futureInvestmentValue(pozajmica,mjesecnaKamtnaStopa,i));
        }
    }
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
