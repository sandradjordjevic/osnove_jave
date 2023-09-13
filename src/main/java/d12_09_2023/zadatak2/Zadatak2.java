package d12_09_2023.zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//        U glavnoj klasi:
//        kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//        Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite

        ZeleniKarton karton1 = new ZeleniKarton("Sandra Djordjevic", 2331);
        karton1.setPredmet("Unutrasnja arhitektura");
        karton1.setProfesor("Aleksandar Kekovic");
        karton1.setOcena(10);
        if (karton1.daLiJeIspitPolozen()) {
            System.out.println("Ispit je polozen.");
        } else {
            System.out.println("Ispit nije polozen.");
        }
        karton1.stampaj();

        ZeleniKarton karton2 = new ZeleniKarton("Sandra Djordjevic", 2331);
        karton2.setPredmet("Urbanizam");
        karton2.setProfesor("Ljiljana Vasilevska");
        karton2.setOcena(10);

        ZeleniKarton karton3 = new ZeleniKarton("Sandra Djordjevic", 2331);
        karton3.setPredmet("Mehanika");
        karton3.setProfesor("Marina Mijalkovic");
        karton3.setOcena(9);

        ZeleniKarton karton4 = new ZeleniKarton("Sandra Djordjevic", 2331);
        karton4.setPredmet("Matematika");
        karton4.setProfesor("Predrag Popovic");
        karton4.setOcena(8);

        ZeleniKarton karton5 = new ZeleniKarton("Sandra Djordjevic", 2331);
        karton5.setPredmet("Metalne konstrukcije");
        karton5.setProfesor("Todor Vacev");
        karton5.setOcena(5);

        ArrayList <ZeleniKarton> ispiti = new ArrayList<>();
        ispiti.add(karton1);
        ispiti.add(karton2);
        ispiti.add(karton3);
        ispiti.add(karton4);
        ispiti.add(karton5);

        for (int i = 0; i < ispiti.size(); i++) {
            ispiti.get(i).stampaj();
            System.out.println();
        }

        int ocene = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            ocene += ispiti.get(i).getOcena();
        }
        int prosecnaOcena = ocene / ispiti.size();
        System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);

        int ocenePolozenih = 0, brojIspita = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if(ispiti.get(i).daLiJeIspitPolozen()) {
                ocenePolozenih += ispiti.get(i).getOcena();
                brojIspita++;
            }
        }
        int prosecnaOcenaPolozenih = ocenePolozenih / brojIspita;
        System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozenih);

    }
}
