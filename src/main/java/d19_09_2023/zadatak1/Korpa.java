package d19_09_2023.zadatak1;

import java.util.ArrayList;

public class Korpa {
    private ArrayList <Ambalaza> ambalaze;
    private SuperKartica kartica;
    public Korpa() {
        this.ambalaze = new ArrayList<>();
    }
    public void dodajAmbalazu (Ambalaza ambalaza) {
        this.ambalaze.add(ambalaza);
    }
    public void izbaciAmbalazu (String barkod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).barkod.equals(barkod)) {
                this.ambalaze.remove(this.ambalaze.get(i));
            }
        }
    }
    public double cenaSaPopustom (double popust) {
        double ukupnaCena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            ukupnaCena += this.ambalaze.get(i).cenaArtikla();
        }
        return ukupnaCena - popust;
    }
    public double cenaSaSuperKarticom (SuperKartica kartica) {
        double ukupnaCena = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            ukupnaCena += this.ambalaze.get(i).cenaArtikla();
        }
        return ukupnaCena - kartica.getPopust();
    }
    public void stampaj () {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            this.ambalaze.get(i).stampaj();
        }
    }

    public SuperKartica getKartica() {
        return kartica;
    }

    public void setKartica(SuperKartica kartica) {
        this.kartica = kartica;
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }
}
