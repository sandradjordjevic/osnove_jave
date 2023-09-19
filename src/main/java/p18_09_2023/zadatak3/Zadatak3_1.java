package p18_09_2023.zadatak3;

import java.util.ArrayList;

public class Zadatak3_1 {
    public static void main(String[] args) {
//        3.1 Zadatak
//        Kreirati klasu FigureGenerator koja ima:
//        Napisati metodu koja generiše geometrijske figure u zavisnosti od prosleđenog parametra koji predstavlja tip
//        figure. Tip figure može biti trougao ili pravougaonik. U zavisnosti od tipa figure, funkcija treba da kreira
//        odgovarajući objekat i vrati ga kao povratnu vrednost. Po defaultu, funkcija treba da kreira pravougaonik sa
//        stranicama dužine 5 i 10 i trougao sa stranicama dužine 5.
//        (ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova. N je parametar metode
//        (ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N pravougaonika. N je parametar metode
//        (ZA VEZBAJE) Kreirati metodu koja kreira i vraca niz od N trouglova i N pravougaonika. N je parametar metode

//        U glavnom programu generisati 3 pravougaonika i 2 trougla
        FigureGenerator generator = new FigureGenerator();
        ArrayList<Figura> pravougaonici = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            pravougaonici.add(generator.generisiFiguru("pravouganik"));
        }

        ArrayList<Figura> trouglovi = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            trouglovi.add(generator.generisiFiguru("pravougaonik"));
        }

        FigureGenerator generatorFigura = new FigureGenerator();
        ArrayList<Figura> figure = generatorFigura.generisiNFigura(3);

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }
    }
}
