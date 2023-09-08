package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnjaNa100;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int kubikaza;
    public String brojRegistracije;
    public boolean daLiJeUkljucenaKlima;

    public int maxBrzina;

    public void stampaj() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100 + "l na 100km");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina" );
    }
    public Boolean prekoracenjeBrzine (int dozvoljenaBrzina) {
        boolean daLiJePrekoracio = false;
        if(this.trenutnaBrzina > dozvoljenaBrzina) {
            daLiJePrekoracio = true;
        }
        return daLiJePrekoracio;
    }
    public int novcanaKazna (int dozvoljenaBrzina) {
        int kazna = 0;
        if(this.prekoracenjeBrzine(dozvoljenaBrzina)) {
            kazna = (this.trenutnaBrzina - dozvoljenaBrzina) * 1000;
        }
        return kazna;
    }
    public boolean daLiJeOldtajmer () {
        if(this.godinaProizvodnje < 1950) {
            return true;
        }
        return false;
    }
    public boolean daLiJeIsteklaRegistracija (int mesec) {
        if(mesec > this.mesecRegistracije) {
            return true;
        }
        return false;
    }
    public double cenaRegistracije () {
        double cena = this.kubikaza * 100;
        if(this.kubikaza > 2000) {
            cena = cena * 1.3;
        }
        return cena;

    }
    public void dodajGas () {
        this.trenutnaBrzina += 10;
        if(this.trenutnaBrzina > this.maxBrzina) {
            this.trenutnaBrzina = this.maxBrzina;
        }
    }
    public void koci () {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if(this.trenutnaBrzina < 0) {
            this.trenutnaBrzina = 0;
        }
    }
    public double trenutnaPotrosnja() {
        double faktorKlime = 1;
        if(this.daLiJeUkljucenaKlima) {
            faktorKlime = 1.2;
        }
        return (this.trenutnaBrzina / 100 * this.potrosnjaNa100) * faktorKlime;
    }
    public void stampajTablu () {
        for(int i = 0; i < 100; i++) {
            if(i < (this.trenutnaBrzina * 100) / this.maxBrzina) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(this.trenutnaBrzina + "/" + this.maxBrzina + "km/h");
    }
}
