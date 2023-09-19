package d19_09_2023.zadatak1;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla () {
        double cena = this.osnovnaCena * 1.2;
        if (this.daLiSePlacaKaucija) {
            cena += this.kaucija;
        }
        return cena;
    }
    @Override
    public void stampaj () {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.naziv);
        System.out.println("Tezina: " + this.izracunajTezinu());
        System.out.print("Da li se placa kaucija za flasu: ");
        if(this.daLiSePlacaKaucija) {
            System.out.println(" da");
        } else {
            System.out.println(" ne");
        }
        System.out.println("Cena: " + this.cenaArtikla());
        System.out.println();
    }

    public double getKaucija() {
        return kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }
}
