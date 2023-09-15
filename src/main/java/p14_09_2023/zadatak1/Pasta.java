package p14_09_2023.zadatak1;

import p14_09_2023.zadatak1.Sastojak;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        this.sastojci = new ArrayList<>();
    }
    public void dodajSastojak (Sastojak noviSastojak) {
        this.sastojci.add(noviSastojak);
    }
    public double cenaPaste () {
        double cena = 0;
        for(int i = 0; i < this.sastojci.size(); i++) {
            cena += this.sastojci.get(i).getCena();
        }
        return cena;
    }
    public void stampaj () {
        for(int i = 0; i < this.sastojci.size(); i++) {
            this.sastojci.get(i).stampaj();
        }
        System.out.println("Cena paste je " + this.cenaPaste() + " din.");
    }
    public void obrisiSastojak (String nazivSastojka) {
        for(int i = 0; i < this.sastojci.size(); i++) {
            if(this.sastojci.get(i).getNaziv().equals(nazivSastojka)) {
                this.sastojci.remove(this.sastojci.get(i));
            }
        }
    }
}
