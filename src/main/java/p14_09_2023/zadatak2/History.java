package p14_09_2023.zadatak2;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> pages;
    public History() {
        this.pages = new ArrayList<>();
    }
    public void otvoriStranicu (HistoryPage page) {
        this.pages.add(page);
    }
    public void stampaj () {
        for (int i = 0; i < this.pages.size(); i++) {
            System.out.println(this.pages.get(i).getNaziv());
        }
    }
    public void obrisi (String link) {
        for (int i = 0; i < this.pages.size(); i++) {
            if(this.pages.get(i).getLink().equals(link)) {
                this.pages.remove(this.pages.get(i));
            }
        }
    }
    public void obrisiKolaciceZaLink (String link) {
        for (int i = 0; i < this.pages.size(); i++) {
            if(this.pages.get(i).getLink().equals(link)) {
                this.pages.get(i).obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju () {
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.remove(this.pages.get(i));
        }
    }
    public void sacuvajKredencija (String nazivStranice, String korisnickoIme, String sifra) {
        for (int i = 0; i < this.pages.size(); i++) {
            if(this.pages.get(i).getNaziv().equals(nazivStranice)) {
                this.pages.get(i).sacuvajKredencijale(korisnickoIme, sifra);
            }
        }
    }
    public void pregledajIstoriju () {
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.get(i).stampaj();
        }
    }
    public void obrisiSveKolacice () {
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.get(i).obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaSadnjihSatVremena (int sat, int minut) {
        int vreme = sat * 60 + minut;
        for (int i = 0; i < this.pages.size(); i++) {
            int satStranice = this.pages.get(i).getSat();
            int minutiStranice = this.pages.get(i).getMinut();
            int vremeStranice = satStranice * 60 + minutiStranice;
            int razlika = vreme - vremeStranice;
            if (razlika <= 60) {
                this.pages.get(i).obrisiKolacice();
            }
        }
    }
}
