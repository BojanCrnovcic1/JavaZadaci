package Poglavlje3;

public class RandomMonth3_4 {
    public static void main(String[] args) {

        int mjesec = (int) (Math.random() * 12) +1;

        switch (mjesec) {
            case 1 : {
                System.out.println("Januar");
            }break;
            case 2 : {
                System.out.println("Februar");
            }break;
            case 3 : {
                System.out.println("Mart");
            }break;
            case 4 : {
                System.out.println("April");
            }break;
            case 5 : {
                System.out.println("Maj");
            }break;
            case 6 : {
                System.out.println("Jun");
            }break;
            case 7 : {
                System.out.println("Jul");
            }break;
            case 8 : {
                System.out.println("Avgust");
            }break;
            case 9 : {
                System.out.println("Septembar");
            }break;
            case 10 : {
                System.out.println("Oktobar");
            }break;
            case 11 : {
                System.out.println("Novembar");
            }break;
            case 12 : {
                System.out.println("Decembar");
            }break;
        }
    }
}
