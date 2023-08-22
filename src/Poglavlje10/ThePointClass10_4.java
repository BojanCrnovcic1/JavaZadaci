package Poglavlje10;

import Klase.MyPoint;
public class ThePointClass10_4 {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(22.5,11.2);

        System.out.println("Distanca izmedju 2 tacke je : " + point1.distance(point2));
    }
}
