package Poglavlje5;

import java.util.Scanner;

public class FinancialApplicationLoanAmortizationSchedule5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount : ");
        double iznosPozajmice = input.nextDouble();
        System.out.println("Enter number of years : ");
        int godina = input.nextInt();
        System.out.println("Enter interest rate : ");
        double godinsnjaKamatnaStopa = input.nextDouble();

        double mjesecnaStopa = godinsnjaKamatnaStopa / 1200;
        double mjesecnoPlacanje = iznosPozajmice * mjesecnaStopa / (1
                -1 / Math.pow(1 + mjesecnaStopa, godina * 12));

        System.out.println("Monthly payment : " + mjesecnoPlacanje);
        System.out.println("Total payment : " + (mjesecnoPlacanje * 12) * godina);

        double balance = iznosPozajmice, interest, principal;

        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
        for (int i = 1; i <= godina * 12; i++) {
            interest = mjesecnaStopa * balance;
            principal = mjesecnoPlacanje - interest;
            balance = balance - principal;

            System.out.println(i+"\t\t"+interest+"\t\t"+principal+"\t\t"+balance);
        }

    }
}
