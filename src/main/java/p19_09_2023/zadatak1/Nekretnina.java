package p19_09_2023.zadatak1;

public abstract class Nekretnina {
    protected  String adresa;
    protected double povrsina;
    protected int zona;

    public Nekretnina(String adresa, double povrsina, int zona) {
        this.adresa = adresa;
        this.povrsina = povrsina;
        this.zona = zona;
    }
    public double vratiKoeficijent () {
        double koeficijent = 0;
        if (this.zona == 1) {
            koeficijent = 1.4;
        }
        if (this.zona == 2) {
            koeficijent = 1.1;
        }
        if (this.zona == 3) {
            koeficijent = 1.05;
        }
        return koeficijent;
    }
    public abstract double izracunajPorez ();
    public abstract void stampaj ();

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
}
