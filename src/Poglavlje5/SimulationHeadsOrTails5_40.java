package Poglavlje5;

public class SimulationHeadsOrTails5_40 {
    public static void main(String[] args) {

        System.out.println("Koliko ce novcic pasti na glavu ili pismo u milion pokusaja ? ");

        int glava = 0;
        int pismo = 1;

        for (int i = 0; i < 1000000; i++) {
            int novcic = (int) (Math.random() * 2);
            if (novcic == 0) {
                glava++;
            }
            else
                pismo++;
        }
        System.out.println("Novcic pada : " +
                "\nGlava : " + glava +"" +
                "\nPismo : " + pismo);
    }
}
