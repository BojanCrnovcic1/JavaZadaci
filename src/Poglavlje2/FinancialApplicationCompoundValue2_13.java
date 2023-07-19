package Poglavlje2;

import java.util.Scanner;

public class FinancialApplicationCompoundValue2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite iznos ustede : ");
        double usteda = input.nextDouble();

        double kamatnaStopa = (1 + 0.00417);

        double prviMjesec = usteda * kamatnaStopa;
        double drugiMjesec = (usteda + prviMjesec) * kamatnaStopa;
        double treciMjesec = (usteda + drugiMjesec) * kamatnaStopa;
        double cetvrtiMjesec = (usteda + treciMjesec) * kamatnaStopa;
        double petiMjesec = (usteda + cetvrtiMjesec) * kamatnaStopa;
        double sestiMjesec = (usteda + petiMjesec) * kamatnaStopa;

        System.out.println("Nakon sest mjeseci stednje iznos je : " + sestiMjesec);



    }
}
