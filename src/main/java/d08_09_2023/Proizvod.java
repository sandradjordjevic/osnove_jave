package d08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println(this.naziv + ", " + this.cena + " dinara, " + this.tezina + " g.");
    }
    public void povecajCenu (double povecanje) {
        this.cena += povecanje;
    }
    public double cenaSapopustom (double popust) {
        double novaCena = this.cena - popust;
        return novaCena;
    }
    public double racunajPostarinu () {
        double postarina = 0;
        if(this.tezina <= 200) {
            postarina = 200;
        } else if (this.tezina > 200 && this.tezina <= 500) {
            postarina = 400;
        } else {
            postarina = 1000;
        }
        return postarina;
    }
}
