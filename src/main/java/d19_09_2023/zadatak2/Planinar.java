package d19_09_2023.zadatak2;

public abstract class Planinar {
    protected int identifikacioniBroj;
    protected String imePrezime;

    public Planinar(int identifikacioniBroj, String imePrezime) {
        this.identifikacioniBroj = identifikacioniBroj;
        this.imePrezime = imePrezime;
    }
    public abstract void stampaj ();
    public abstract double cenaClanarine ();
    public abstract boolean uspesanUspon (Planina planina);

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    public String getImePrezime() {
        return imePrezime;
    }
}
