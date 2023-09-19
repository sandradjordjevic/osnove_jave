package p19_09_2023.zadatak1;

public class Lokal extends Nekretnina {
    public Lokal(String adresa, double povrsina, int zona) {
        super(adresa, povrsina, zona);
    }
    @Override
    public double izracunajPorez () {
        return this.vratiKoeficijent() * this.povrsina * 1.3;
    }
    @Override
    public void stampaj () {
        System.out.println("Lokal");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina + "m2");
        System.out.println("Zona: " + this.zona);
        System.out.println("Porez: " + this.izracunajPorez() + "din.");
        System.out.println();
    }
}
