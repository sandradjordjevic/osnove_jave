package d12_09_2023.zadatak3;

import d12_09_2023.zadatak3.Racun;

public class Transakcija {
    private int id;
    private Racun racunSaKogSePrenosi;
    private Racun racunNaKojiSePrenosi;
    public Transakcija (int id) {
        this.id = id;
    }
    public double izracunajProviziju (double iznos) {
        double provizija = 0;
        if (iznos < 4500) {
            provizija = 45;
        } else {
            provizija = iznos * 1 / 100;
        }
        return provizija;
    }
    public void izvrsiTransakciju (double iznos) {
        if (this.racunSaKogSePrenosi.getTrenutnoStanje() > iznos + izracunajProviziju(iznos)) {
            this.racunSaKogSePrenosi.skiniSaRacuna(iznos + izracunajProviziju(iznos));
            this.racunNaKojiSePrenosi.uplatiNaRacun(iznos);
            System.out.println("Transakcija je izvrsena!");
        } else {
            System.out.println("Transakcija nije izvrsena!");
        }
    }
    public void stampaj () {
        System.out.println("ID Transakcije: " + this.id);
        System.out.println("Racun sa: " + this.racunSaKogSePrenosi.getImePrezime() + " - " + this.racunSaKogSePrenosi.getBroj());
        System.out.println("Racun na: " + this.racunNaKojiSePrenosi.getImePrezime() + " - " + this.racunSaKogSePrenosi.getBroj());
    }
    public int getId () {
        return this.id;
    }
    public void setRacunSaKogSePrenosi (Racun racunSaKogSePrenosi) {
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
    }
    public Racun getRacunSaKogSePrenosi () {
        return this.racunSaKogSePrenosi;
    }
    public void setRacunNaKojiSePrenosi (Racun racunNaKojiSePrenosi) {
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }
    public Racun getRacunNaKojiSePrenosi () {
        return this.racunNaKojiSePrenosi;
    }
}
