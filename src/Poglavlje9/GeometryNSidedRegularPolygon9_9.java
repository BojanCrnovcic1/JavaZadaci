package Poglavlje9;

import Klase.RegularPolygon;

public class GeometryNSidedRegularPolygon9_9 {
    public static void main(String[] args) {

        RegularPolygon poligon1 = new RegularPolygon();
        RegularPolygon poligon2 = new RegularPolygon(6,4);
        RegularPolygon poligon3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("Poligon jedan # \nObim : " + poligon1.getPerimeter() + "" +
                "\nPovrsina : " + poligon1.getArea() + "\n");
        System.out.println("Poligon dva # \nObim : " + poligon2.getPerimeter() + "" +
                "\nPovrsina : " + poligon2.getArea() + "\n");
        System.out.println("Poligon tri # \nObim : " + poligon3.getPerimeter() + "" +
                "\nPovrsina : " + poligon3.getArea());
    }
}
