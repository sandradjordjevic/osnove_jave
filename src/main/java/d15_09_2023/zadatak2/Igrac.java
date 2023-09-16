package d15_09_2023.zadatak2;

import d15_09_2023.zadatak1.Osoba;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;
    private ArrayList<Karton> kartoni;

    public Igrac() {

    }
    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni = new ArrayList<>();
    }
    public void dodajKarton (Karton karton) {
        this.kartoni.add(karton);
    }
    public int brojZutih () {
        int broj = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")) {
                broj++;
            }
        }
        return broj;
    }
    public int brojCrvenih () {
        int broj = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                broj++;
            }
        }
        return broj;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        if (this.kapiten) {
            System.out.println("Kapiten: da");
        } else {
            System.out.println("Kapiten: ne");
        }
        System.out.println("Broj zutih kartona: " + this.brojZutih());
        System.out.println("Broj crvenih kartona: " + this.brojCrvenih());
        System.out.println();
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
}
