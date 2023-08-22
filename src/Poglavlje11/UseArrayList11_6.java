package Poglavlje11;

import Klase.Circle;
import Klase.Loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class UseArrayList11_6 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan());
        list.add(new Date());
        list.add(new String("\nString text"));
        list.add(new Circle());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
