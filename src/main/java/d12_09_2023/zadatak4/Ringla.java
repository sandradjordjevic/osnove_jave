package d12_09_2023.zadatak4;

public class Ringla {
    private String tip;
    private int jacina;
    private double jacinaGrejaca;
    public Ringla (String tip, double jacinaGrejaca) {
        this.tip = tip;
        this.jacinaGrejaca = jacinaGrejaca;
        this.jacina = 0;
    }
    private int maxBrojPojacavanja () {
        int brojPojacavanja = 0;
        if (this.tip.equals("obicna")) {
            brojPojacavanja = 3;
        }
        if (this.tip.equals("expres")) {
            brojPojacavanja = 12;
        }
        return brojPojacavanja;
    }
    public void pojacaj () {
        if(this.jacina < this.maxBrojPojacavanja()) {
            this.jacina++;
        }
    }
    public void iskljuci () {
        this.jacina = 0;
    }
    public boolean daLiJeUkljucena () {
        return this.jacina > 0;
    }
    public double potrosnjaElekticneEnergije (int brojSati) {
        return 100 / this.maxBrojPojacavanja() * this.jacina * this.jacinaGrejaca * brojSati;
    }
    public void stampaj () {
        System.out.print("Ringla je " );
        if (this.daLiJeUkljucena()) {
            System.out.println("ukljucena");
        } else {
            System.out.println("iskljucena");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca + "kW");
    }
    public int getJacina () {
        return this.jacina;
    }

}
