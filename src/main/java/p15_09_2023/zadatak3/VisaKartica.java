package p15_09_2023.zadatak3;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;
    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju (double iznos) {
        double provizija = iznos * 1.8 / 100;
        if (provizija < 4) {
            super.izvrsiTransakciju(4);
        } else {
            super.izvrsiTransakciju(iznos + provizija);
        }
    }
    @Override
    public void stampaj () {
        System.out.print("Visa Card: ");
        super.stampaj();
    }
    public String getOvlascenoLice() {
        return ovlascenoLice;
    }
    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
}
