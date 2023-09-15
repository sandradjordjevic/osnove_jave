package p15_09_2023.zadatak2;

public class Profesor extends Osoba{
    private String predmet;
    private double plata;

    public Profesor(String imePrezime, String jmbg, String predmet, double plata) {
        super(imePrezime, jmbg);
        this.predmet = predmet;
        this.plata = plata;
    }
    public void povecajPlatu (int procenat) {
        this.plata += this.plata * procenat / 100;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Predmet: " + this.predmet);
        System.out.println("Plata: " + this.plata);
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
}
