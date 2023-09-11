package p11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndexa;
    private boolean budzet;

    public void setIme (String ime) {
        this.ime = ime;
    }
    public String getIme () {
        return this.ime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }
    public String getPrezime () {
        return this.prezime;
    }
    public void setBrojIndexa (int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    public int getBrojIndexa () {
        return this.brojIndexa;
    }
    public void setBudzet (boolean budzet) {
        this.budzet = budzet;
    }
    public boolean getBudzet () {
        return this.budzet;
    }
    public void stampaj () {
        System.out.println("Student: " + this.ime + " " + this.prezime);
        System.out.println("Broj indexa: " + this.brojIndexa);
        String daLiJeNaBudzetu = "";
        if(this.getBudzet()) {
            daLiJeNaBudzetu = "da";
        } else {
            daLiJeNaBudzetu = "ne";
        }
        System.out.println("Da li je na budzetu: " + daLiJeNaBudzetu);
    }
}
