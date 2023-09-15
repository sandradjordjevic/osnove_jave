package p15_09_2023.zadatak1;

import p15_09_2023.zadatak1.Auto;
import p15_09_2023.zadatak1.Kamion;

public class Zadatak1 {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.setRegistracija("LE053");
        a.setBrojVrata(5);
        a.setMarka("BMW");
        a.dodajGas();
        a.dodajGas();
        a.dodajGas();
        a.koci();
        a.stampaj();

        Kamion k = new Kamion();
        k.setRegistracija("LE-011");
        k.setMarka("FAP");
        k.setNosivost(2000);
        k.dodajGas();
        k.dodajGas();
        k.stampaj();


    }
}
