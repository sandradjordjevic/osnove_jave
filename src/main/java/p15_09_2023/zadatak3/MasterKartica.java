package p15_09_2023.zadatak3;

public class MasterKartica extends PlatnaKartica{
    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }
    @Override
    public void izvrsiTransakciju (double iznos) {
        double provizija = iznos * 1.5 / 100;
        super.izvrsiTransakciju(iznos + provizija);
    }
    public void odrzavanje () {
        this.suma -= 2;
    }
    @Override
    public void stampaj () {
        System.out.print("Master card: ");
        super.stampaj();
    }
}
