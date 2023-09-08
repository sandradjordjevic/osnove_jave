package d07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zadatak 2: Kreiranje klase "Automobil"
//        Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
//        U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.
        Automobil a1 = new Automobil();
        a1.marka = "Mercedes";
        a1.model = "A-180";
        a1.godinaProizvodnje = 2020;
        System.out.println("Marka automobila: " + a1.marka + ", model automobila: " + a1.model + ", godina proizvodnje " + a1.godinaProizvodnje);

        Automobil a2 = new Automobil();
        a2.marka = "Volkswagen";
        a2.model = "Arteon";
        a2.godinaProizvodnje = 2023;
        System.out.println("Marka automobila: " + a2.marka + ", model automobila: " + a2.model + ", godina proizvodnje " + a2.godinaProizvodnje);

        Automobil a3 = new Automobil();
        a3.marka = "Audi";
        a3.model = "A3";
        a3.godinaProizvodnje = 2021;
        System.out.println("Marka automobila: " + a3.marka + ", model automobila: " + a3.model + ", godina proizvodnje " + a3.godinaProizvodnje);
    }
}
