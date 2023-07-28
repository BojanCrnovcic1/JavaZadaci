package Poglavlje9;

import Klase.StopWatch;

import java.util.Collections;

public class Stopwatch9_6 {
    public static void main(String[] args) {

        int[] niz = array();

        StopWatch stoperica = new StopWatch();

        stoperica.start();

        sortArray(niz);

        stoperica.end();

        System.out.println("Vrijeme potrebno za sortiranje 100 000 brojeva : " + stoperica.getElapsedTime()
                + " milisekundi.");
    }

    public static int[] array() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[0];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                array[index] = i;
                array[i] = i;
            }

        }
    }
}
