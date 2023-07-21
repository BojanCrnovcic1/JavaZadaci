package Poglavlje4;

import java.util.Scanner;

public class OrderThreeCities4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite prvi grad : ");
        String prviGrad = input.nextLine();
        System.out.println("Unesite drugi grad : ");
        String drugiGrad = input.nextLine();
        System.out.println("Unesite treci grad : ");
        String treciGrad = input.nextLine();

        String temp;
        if (drugiGrad.compareTo(prviGrad) < 0 && drugiGrad.compareTo(treciGrad) < 0) {
            temp = prviGrad;
            prviGrad = drugiGrad;
            drugiGrad = temp;
        }
        else if (treciGrad.compareTo(prviGrad) < 0 && treciGrad.compareTo(drugiGrad) < 0) {
            temp = prviGrad;
            prviGrad = treciGrad;
            treciGrad = temp;
        }

        if (treciGrad.compareTo(drugiGrad) < 0) {
            temp = drugiGrad;
            drugiGrad = treciGrad;
            treciGrad = temp;
        }

        System.out.println("Gradovi po alfabetskom redu : "+ prviGrad + ", " + drugiGrad + ", " + treciGrad);
    }
}
