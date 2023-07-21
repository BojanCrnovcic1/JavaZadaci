package Poglavlje4;

import java.util.Scanner;

public class FinancialApplicationPayroll4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite ime zaposlenog : ");
        String ime = input.nextLine();
        System.out.println("Unesite broj radnih sati : ");
        double radniSati = input.nextDouble();
        System.out.println("Unesite satnicu : ");
        double satnica = input.nextDouble();
        System.out.println("Unesite u procentima taksu federalnog poreza : ");
        double federalniPorezProcenat = input.nextDouble();
        System.out.println("Unesite u procentima taksu drzanog poreza : ");
        double drzavniPorezProcenat = input.nextDouble();

        double bruto = radniSati * satnica;
        double federalniPorez = bruto * federalniPorezProcenat;
        double drzavniPorez = bruto * drzavniPorezProcenat;
        double totalniOdbici = federalniPorez + drzavniPorez;
        double neto = bruto - totalniOdbici;

        System.out.println("Ime zaposlenog : " + ime +
                "\nBroj radnih sati u sedmici : " + radniSati + "" +
                "\nSatnica : $" + satnica + "" +
                "\nBruto : $" + bruto + "" +
                "\nOdbici : " + "" +
                "\nFederalni porez (20.0 %) : $" + federalniPorez + "" +
                "\nDrzavni porez (9.0 %) : $" + drzavniPorez + "" +
                "\nTotalni odbici : $" + totalniOdbici + "" +
                "\nNeto : $" + neto);


    }
}
