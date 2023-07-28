package Poglavlje9;

import Klase.Rectangle;

public class TheRectangleClass9_1 {
    public static void main(String[] args) {

        Rectangle pravougaonik1 = new Rectangle(4,40);
        Rectangle pravougaonik2 = new Rectangle(3.5,35.9);

        System.out.println("Prvi pravouganik : \nSirina : " + pravougaonik1.sirina + "" +
                "\nVisina : " + pravougaonik1.visina + "" +
                "\nPovrsina : " + pravougaonik1.getArea() + "" +
                "\nObim : " + pravougaonik1.getPerimeter() + "\n");
        System.out.println("Drugi pravouganik : \nSirina : " + pravougaonik2.sirina + "" +
                "\nVisina : " + pravougaonik2.visina + "" +
                "\nPovrsina : " + pravougaonik2.getArea() + "" +
                "\nObim : " + pravougaonik2.getPerimeter());
    }
}
