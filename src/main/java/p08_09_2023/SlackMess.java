package p08_09_2023;

public class SlackMess {
    public String tekstPoruke;
    public String imePrezime;
    public String datumVreme;
    public String azuriranjeDatumVreme;
    public void stampaj(){
        System.out.println(this.imePrezime + " - " + this.datumVreme);
        System.out.println(this.tekstPoruke);
    };
    public void azuriraj(String noviTekst, String azuriranjeDatumVreme) {
        this.tekstPoruke = noviTekst;
        this.datumVreme = azuriranjeDatumVreme;
    }
}
