package p18_09_2023.zadatak2;

public abstract class Student {
    protected String imePrezime;
    protected int brojIndexa;
    protected int godinaStudija;

    public Student(String imePrezime, int brojIndexa, int godinaStudija) {
        this.imePrezime = imePrezime;
        this.brojIndexa = brojIndexa;
        this.godinaStudija = godinaStudija;
    }
    public abstract double cenaSkolarine ();
    public abstract boolean daLiJeNaBudzetu ();
    public void stampaj () {
        System.out.println(this.imePrezime + ", " + this.brojIndexa + ", " + this.godinaStudija);
        System.out.print("Finansiranje: " );
        if(this.daLiJeNaBudzetu()) {
            System.out.println("budzet");
        } else {
            System.out.println("samofinansiranje");
        }
        System.out.println("Cena skolarine: " + this.cenaSkolarine());
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }
}
