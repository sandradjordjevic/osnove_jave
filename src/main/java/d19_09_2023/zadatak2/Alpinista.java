package d19_09_2023.zadatak2;

public class Alpinista extends Planinar {
    private int brojPoena;

    public Alpinista(int identifikacioniBroj, String imePrezime, int brojPoena) {
        super(identifikacioniBroj, imePrezime);
        this.brojPoena = brojPoena;
    }
    @Override
    public boolean uspesanUspon (Planina planina) {
        if (planina.getVisina() <= 4000) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public double cenaClanarine () {
        double clanarina = 1500 - this.brojPoena * 50;
        if (clanarina < 0) {
            clanarina = 0;
        }
        return clanarina;
    }
    @Override
    public void stampaj () {
        System.out.println("Alpinista, id: " + this.identifikacioniBroj);
        System.out.println("ime: " + this.imePrezime);
        System.out.println("broj poena: " + this.brojPoena);
        System.out.println();
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }
}
