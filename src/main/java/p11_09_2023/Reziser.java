package p11_09_2023;

public class Reziser {
    private String imePrezime;
    private int starost;
    public Reziser (String imePrezime, int starost) {
        this.imePrezime = imePrezime;
        this.starost = starost;
    }
    public void stampaj () {
        System.out.println("Reziser: " + this.imePrezime);
        System.out.println("Starost: " + this.starost);
    }
    public void setImePrezime (String imePrezime) {
        this.imePrezime = imePrezime;
    }
    public String getImePrezime () {
        return this.imePrezime;
    }
    public void setStarost (int starost) {
        this.starost = starost;
    }
    public int getStarost () {
        return this.starost;
    }
}
