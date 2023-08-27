package MiniProjekat;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//  2.**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//  Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede tako
//  da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//  ●	Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//  ●	Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće
//  čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false)..
//  Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika
//  na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//  Program će ispisivati informacije za svakog korisnika na sledeći način:
//  ●	Za aktivne korisnike:
//  | slika |o Ime Prezime
//  ●	Za neaktivne korisnike:
//  | slika |x Ime Prezime

        ArrayList<String> users = new ArrayList<>();
        users.add("Marko Markovic");
        users.add("Pera Peric");
        users.add("Mika Mikic");
        users.add("Zika Zikic");
        users.add("Petar Petrovic");

        ArrayList<Boolean> activity = new ArrayList<>();
        activity.add(true);
        activity.add(false);
        activity.add(true);
        activity.add(false);
        activity.add(true);

        for(int i = 0; i < users.size(); i++) {
            if(activity.get(i)) {
                System.out.println("| image | o " + users.get(i));
            }
        }

        for(int i = 0; i < users.size(); i++) {
            if(!activity.get(i)) {
                System.out.println("| image | x " + users.get(i));
            }
        }
    }
}
