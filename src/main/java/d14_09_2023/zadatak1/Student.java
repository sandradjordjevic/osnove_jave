package d14_09_2023.zadatak1;

import d14_09_2023.zadatak1.Ispit;

import java.util.ArrayList;

public class Student {
    private int brojIndexa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student (int brojIndexa, String imePrezime, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }
    public void dodajIspit (Ispit ispit) {
        this.ispiti.add(ispit);
    }
    public double izracunajProsek () {
        double ispit = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                ispit += this.ispiti.get(i).getOcena();
            }
        }
        return ispit / this.ispiti.size();
    }
    public void stampaj () {
        System.out.println(this.getBrojIndexa() + ", " + this.getImePrezime() + ", " + this.getTipStudija());
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampaj();
        }
        System.out.println("Prosecna ocena: " + this.izracunajProsek());

    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
}
