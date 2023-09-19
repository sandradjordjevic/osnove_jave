package p18_09_2023.zadatak1;

public class MasterKartica extends PlatnaKartica {
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }
    @Override
    public void izvrsiTransakciju (double iznos) {
        double provizija = iznos * 1.5 / 100;
        this.suma = this.suma - iznos - provizija;
    }
    public void odrzavanje () {
        this.suma -= 2;
    }
    @Override
    public void stampaj () {
        System.out.print("Master card: ");
        System.out.println(this.brojKartice + ", " + this.getMesec() + "/" + this.getGodina() + ", $" + this.suma);
    }
}
