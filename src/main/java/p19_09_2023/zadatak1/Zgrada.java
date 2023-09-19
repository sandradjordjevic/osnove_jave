package p19_09_2023.zadatak1;

public class Zgrada extends Nekretnina {
    private int brojStanova;

    public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
        super(adresa, povrsina, zona);
        this.brojStanova = brojStanova;
    }
    @Override
    public double izracunajPorez () {
        return this.vratiKoeficijent() * this.povrsina * this.brojStanova;
    }
    @Override
    public void stampaj () {
        System.out.println("Zgrada");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina + "m2");
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj stanova: " + this.brojStanova);
        System.out.println("Porez: " + this.izracunajPorez() + "din.");
        System.out.println();
    }


    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }
}
