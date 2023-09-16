package d14_09_2023.zadatak2;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacije;
    public Listic() {
        this.kombinacije = new ArrayList<>();
    }
    public void dodajKombinaciju (Kombinacija k) {
        this.kombinacije.add(k);
    }
    public boolean daLiJeDobitna (Kombinacija k) {
        boolean dobitnaKombinacija = false;
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (this.kombinacije.get(i).daLiJeIstaKombinacija(k)) {
                dobitnaKombinacija = true;
            }
        }
        return dobitnaKombinacija;
    }
    public void stampaj () {
        for (int i = 0; i < this.kombinacije.size(); i++) {
            this.kombinacije.get(i).stampaj();
            System.out.println();
        }
    }
    public ArrayList<Kombinacija> getKombinacije() {
        return kombinacije;
    }
}
