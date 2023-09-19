package p19_09_2023.zadatak1;

public class Kuca extends Nekretnina {
    private int brojClanova;

    public Kuca(String adresa, double povrsina, int zona, int brojClanova) {
        super(adresa, povrsina, zona);
        this.brojClanova = brojClanova;
    }
    @Override
    public double izracunajPorez () {
        return this.vratiKoeficijent() * this.getPovrsina();
    }
    @Override
    public void stampaj () {
        System.out.println("Kuca");
        System.out.println("Adresa: " + this.adresa);
        System.out.println("Povrsina: " + this.povrsina + "m2");
        System.out.println("Zona: " + this.zona);
        System.out.println("Broj clanova: " + this.brojClanova);
        System.out.println("Porez: " + this.izracunajPorez() + "din.");
        System.out.println();
    }

    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }
}
