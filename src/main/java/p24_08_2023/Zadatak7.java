package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
//        7. Napisati program koji simulira digitalni meni za pasta bar.
//        Program ima dva niza informacija paste i cene. Program stampa meni u formatu

        ArrayList<String>pasta = new ArrayList<>();
        pasta.add("Aglio Olio");
        pasta.add("Primavera");
        pasta.add("Napolitana");
        pasta.add("Arrabbiata");
        pasta.add("Pollo e spinaci");

        ArrayList<Integer>price = new ArrayList<>();
        price.add(550);
        price.add(350);
        price.add(450);
        price.add(500);
        price.add(550);

        for(int i = 0; i < pasta.size(); i++) {
            System.out.println(pasta.get(i) + ".............." + price.get(i) + " rsd");
        }
    }
}
