package p19_09_2023.zadatak1;

import java.util.ArrayList;

public class PoreskaUprava {
    private String grad;
    ArrayList<Nekretnina> nekretnine;

    public PoreskaUprava(String grad) {
        this.grad = grad;
        this.nekretnine = new ArrayList<>();
    }
    public void dodajObjekat (Nekretnina nekretnina) {
        this.nekretnine.add(nekretnina);
    }
    public Nekretnina najveciPorez () {
        double najveci = this.nekretnine.get(0).izracunajPorez();
        int pozicija = 0;
        for (int i = 1; i < this.nekretnine.size(); i++) {
            if (this.nekretnine.get(i).izracunajPorez() > najveci) {
                najveci = this.nekretnine.get(i).izracunajPorez();
                pozicija = i;
            }
        }
        return this.nekretnine.get(pozicija);
    }
    public Nekretnina najmanjiPorez () {
        double najmanji = this.nekretnine.get(0).izracunajPorez();
        int pozicija = 0;
        for (int i = 1; i < this.nekretnine.size(); i++) {
            if (this.nekretnine.get(i).izracunajPorez() < najmanji) {
                najmanji = this.nekretnine.get(i).izracunajPorez();
                pozicija = i;
            }
        }
        return this.nekretnine.get(pozicija);
    }
    public double ukupanPorez () {
        double ukupno = 0;
        for (int i = 0; i < this.nekretnine.size(); i++) {
            ukupno += this.nekretnine.get(i).izracunajPorez();
        }
        return ukupno;
    }
    public void stampaj () {
        for (int i = 0; i < this.nekretnine.size(); i++) {
            this.nekretnine.get(i).stampaj();
        }
        System.out.println("Ukupan porez za objekte u gradu " + this.grad + " iznosi " + this.ukupanPorez() + "din.");
    }

    public String getGrad() {
        return grad;
    }
}
