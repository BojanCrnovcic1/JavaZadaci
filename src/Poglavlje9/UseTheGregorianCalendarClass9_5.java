package Poglavlje9;

import java.util.GregorianCalendar;

public class UseTheGregorianCalendarClass9_5 {
    public static void main(String[] args) {

        GregorianCalendar kalendar = new GregorianCalendar();

        System.out.println("Vrati vrijeme : godina / mjesec / dan");
        System.out.println(kalendar.get(GregorianCalendar.YEAR) + " / " +
                kalendar.get(GregorianCalendar.MONTH) + " / " + kalendar.get(GregorianCalendar.DAY_OF_MONTH));

        kalendar.setTimeInMillis(1234567898765l);

        System.out.println("Vrati vrijeme od 1970 : godina / mjesec / dan");
        System.out.println(kalendar.get(GregorianCalendar.YEAR) + " / " +
                kalendar.get(GregorianCalendar.MONTH) + " / " + kalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
