package Klase;

public class Time {
    private long sat;
    private long minut;
    private long sekund;

    public Time() {
        System.currentTimeMillis();
    }

    public Time(long elapseTime) {
        setTime(System.currentTimeMillis());
    }

    public Time(long sat, long minut, long sekund) {
        this.sat = sat;
        this.minut = minut;
        this.sekund = sekund;
    }

    public long getSat() {
        return sat;
    }

    public long getMinut() {
        return minut;
    }

    public long getSekund() {
        return sekund;
    }

    public void setTime(long elapseTime) {
        long milisekundi = System.currentTimeMillis();
        long totalSekund = milisekundi / 1000;
        sekund = totalSekund % 60;
        long totalMinut = totalSekund / 60;
        minut = totalMinut % 60;
        long totalSat = totalMinut / 60;
        sat = totalSat % 24;

        if (elapseTime > 0) {
            totalSekund = elapseTime / 1000;
            sekund = totalSekund % 60;
            totalMinut = totalSekund / 60;
            minut = totalMinut % 60;
            totalSat = totalMinut / 60;
            sat = totalSat % 24;
        }
    }
}
