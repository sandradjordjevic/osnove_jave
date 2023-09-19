package d19_09_2023.zadatak1;

public class Tetrapak extends Ambalaza{
    private boolean daLiSeMozeReciklirati;
    private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean daLiSeMozeReciklirati, double osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cenaArtikla () {
        double cena = this.osnovnaCena;
        if (this.daLiSeMozeReciklirati) {
            cena += this.izracunajTezinu() * 1.5;
        }
        return cena;
    }
    public void stampaj () {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.naziv);
        System.out.println("Tezina: " + this.izracunajTezinu());
        System.out.print("Da li se moze reciklirati: ");
        if(this.daLiSeMozeReciklirati) {
            System.out.println(" da");
        } else {
            System.out.println(" ne");
        }
        System.out.println("Cena: " + this.cenaArtikla());
        System.out.println();
    }

    public boolean isDaLiSeMozeReciklirati() {
        return daLiSeMozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }
}
