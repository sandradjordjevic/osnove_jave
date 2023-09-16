package d15_09_2023.zadatak1;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tip;

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }
    @Override
    public void stampaj () {
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tip);
        System.out.println();
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public String getTip() {
        return tip;
    }
}
