package d14_09_2023.zadatak2;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private ArrayList<Integer> brojevi;
    public Kombinacija (String id, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.id = id;
        this.brojevi = new ArrayList<>();
        this.brojevi.add(jedan);
        this.brojevi.add(dva);
        this.brojevi.add(tri);
        this.brojevi.add(cetiri);
        this.brojevi.add(pet);
        this.brojevi.add(sest);
        this.brojevi.add(sedam);
    }
    public boolean  daLiJeIstaKombinacija (Kombinacija k) {
        int broj = 0;
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.brojevi.get(i) == k.brojevi.get(i)){
                broj++;
            }
        }
        return broj == this.brojevi.size();
    }
    public void stampaj () {
        System.out.println("Id kombinacije: " + this.id);
        System.out.print("Brojevi: ");
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (i == this.brojevi.size() - 1) {
                System.out.print(this.brojevi.get(i));
            } else {
                System.out.print(this.brojevi.get(i) + ", ");
            }
        }
    }
    public String getId() {
        return id;
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }

}
