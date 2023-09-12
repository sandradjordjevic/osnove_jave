package p12_09_2023;

public class ZoomCall {
    private String link;
    private String password;
    private Korisnik host;
    private Korisnik guest;
    public ZoomCall (String link, String password, Korisnik host) {
        this.link = link;
        this.password = password;
        this.host = host;
    }
    public void pokreniPoziv () {
        System.out.println("ZoomCall " + this.link);
        System.out.println("Password " + this.password);
        System.out.println("Host " + this.host.getImePrezime());
        System.out.println("Guest " + this.guest.getImePrezime());
        System.out.println("Maksimalno trajanje poziva je " + this.host.vratiMaxDuzinu() + " minuta.");
    }
    public void setGuest (Korisnik guest) {
        this.guest = guest;
    }
    public String getLink () {
        return this.link;
    }
    public String getPassword () {
        return this.password;
    }
    public Korisnik getHost () {
        return this.host;
    }
    public Korisnik getGuest () {
        return this.guest;
    }
}
