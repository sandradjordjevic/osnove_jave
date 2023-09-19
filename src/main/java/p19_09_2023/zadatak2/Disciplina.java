package p19_09_2023.zadatak2;

import java.util.ArrayList;

public class Disciplina {
    private String ime;
    private String tip;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String ime, String tip) {
        this.ime = ime;
        this.tip = tip;
        this.atleticari = new ArrayList<>();
    }
    public void dodajAtleticara (Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }
    public void diskvalifikujAtleticara (String ime) {
        for (int i = 0; i < atleticari.size(); i++) {
            if (this.atleticari.get(i).getIme().equals(ime)) {
                this.atleticari.remove(this.atleticari.get(i));
            }
        }
    }
    private Atleticar najboljiRezultat () {
        if (this.atleticari.isEmpty()) {
            return null;
        }
        Atleticar najbolji = this.atleticari.get(0);
        for (int i = 0; i < atleticari.size(); i++) {
            if (this.atleticari.get(i).daLiJeRezultatBolji(najbolji)) {
                najbolji = this.atleticari.get(i);
            }
        }
        return najbolji;
    }
    public void stampaj () {
        for (int i = 0; i < atleticari.size(); i++) {
            this.atleticari.get(i).stampaj();
        }
        System.out.println("Najbolji rezultat ima: ");
        if(this.najboljiRezultat() == null) {
            System.out.println("/");
        } else {
            this.najboljiRezultat().stampaj();
        }
        System.out.println();
    }
}
