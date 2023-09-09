package d08_09_2023;

public class SmartAirConditioning {
    public String marka;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int izabranaTemperatura;
    public String mod;
    public void stampaj () {
        System.out.println(this.marka + " - " + this.mod + " - " + this.izabranaTemperatura + "C.");
    }
    public int mesecnaPotrosnja () {
        int potrosnja = 0;
        if(this.mod.equals("hladi")) {
            potrosnja = 30 * 15 * this.potrosnjaDokHladi;
        }
        if(this.mod.equals("greje")) {
            potrosnja = 30 * 15 * this.potrosnjaDokGreje;
        }
        return potrosnja;
    }
    public int mesecnaPotrosnjaNovca () {
        int potrosnja = 350 * 6 + (this.mesecnaPotrosnja() - 350) * 9;
        return potrosnja;
    }
}
