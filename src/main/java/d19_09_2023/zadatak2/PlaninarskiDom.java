package d19_09_2023.zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList <Planinar> planinari;

    public PlaninarskiDom() {
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String naziv, int godinaOsnivanja) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.planinari = new ArrayList<>();
    }
    public void uclaniPlaninara (Planinar planinar) {
        this.planinari.add(planinar);
    }
    public int brojUspesnih (Planina planina) {
        int broj = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).uspesanUspon(planina)) {
                broj++;
            }
        }
        return broj;
    }
    public void izbaciPlaninara (int identifikacioniBroj) {
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).identifikacioniBroj == identifikacioniBroj) {
                this.planinari.remove(this.planinari.get(i));
            }
        }
    }
    public void stampaj () {
        System.out.println("Naziv doma: " + this.naziv);
        System.out.println("Godina osnivanja: " +this.godinaOsnivanja);
        System.out.println("Clanovi: ");
        for (int i = 0; i < this.planinari.size(); i++) {
            this.planinari.get(i).stampaj();
        }
    }
    public double sumaClanarina () {
        double suma = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            suma += this.planinari.get(i).cenaClanarine();
        }
        return suma;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }
}
