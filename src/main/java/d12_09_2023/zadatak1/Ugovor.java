package d12_09_2023.zadatak1;

import d12_09_2023.zadatak1.FizickoLice;

public class Ugovor {
    private String datumSklapanja;
    private FizickoLice kupac;
    private FizickoLice prodavac;
    private double cenaNekretnine;
    private String adresaNekretnine;
    public Ugovor (String datumSklapanja, double cenaNekretnine, String adresaNekretnine) {
        this.datumSklapanja = datumSklapanja;
        this.cenaNekretnine = cenaNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }
    public double izracunajProcenatZarade () {
        double procenatZarade = 0;
        if (this.kupac.getDaLiJeKupovaoNekretnine()) {
            procenatZarade = 0.02;
        } else {
            procenatZarade = 0.03;
        }
        return procenatZarade;
    }
    public double izracunajZaraduAgencije () {
        return 1000 + this.cenaNekretnine * this.izracunajProcenatZarade();
    }
    public void stampaj () {
        System.out.print("Dana " + this.datumSklapanja + "god. sklopljen je ugovor izmedju " + this.prodavac.getImePrezime());
        System.out.println(" i " + this.kupac.getImePrezime() + " o kupovini nekretnine " + this.adresaNekretnine + " po ceni od ");
        System.out.println(this.cenaNekretnine + "$ pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.izracunajZaraduAgencije() + "$");
    }
    public String getDatumSklapanja () {
        return this.datumSklapanja;
    }
    public double getCenaNekretnine () {
        return this.cenaNekretnine;
    }
    public String getAdresaNekretnine () {
        return this.adresaNekretnine;
    }
    public void setKupac (FizickoLice kupac) {
        this.kupac = kupac;
    }
    public FizickoLice getKupac () {
        return this.kupac;
    }
    public void setProdavac (FizickoLice prodavac) {
        this.prodavac = prodavac;
    }
    public FizickoLice getProdavac () {
        return this.prodavac;
    }


}
