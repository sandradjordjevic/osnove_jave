package d12_09_2023.zadatak4;

public class ElektricniSporet {
    private String marka;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;
    public ElektricniSporet (String marka, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        this.marka = marka;
        this.garancija = garancija;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }
    public void pojacaj (int pozicija) {
        int brojUkljucenihRingli = 0;
        if(this.goreLevo.daLiJeUkljucena()) {
            brojUkljucenihRingli++;
        }
        if(this.goreDesno.daLiJeUkljucena()) {
            brojUkljucenihRingli++;
        }
        if(this.doleLevo.daLiJeUkljucena()) {
            brojUkljucenihRingli++;
        }
        if(this.doleDesno.daLiJeUkljucena()) {
            brojUkljucenihRingli++;
        }

        if (pozicija == 1) {
            if(brojUkljucenihRingli > this.maxBrojUkljucenihRingli) {
                this.goreDesno.iskljuci();
                this.doleDesno.iskljuci();
                this.doleLevo.iskljuci();
            }
            this.goreLevo.pojacaj();
        }
        if (pozicija == 2) {
            if(brojUkljucenihRingli > this.maxBrojUkljucenihRingli) {
                this.goreLevo.iskljuci();
                this.doleDesno.iskljuci();
                this.doleLevo.iskljuci();
            }
            this.goreDesno.pojacaj();
        }
        if (pozicija == 3) {
            if(brojUkljucenihRingli > this.maxBrojUkljucenihRingli) {
                this.goreDesno.iskljuci();
                this.doleDesno.iskljuci();
                this.goreLevo.iskljuci();
            }
            this.doleLevo.pojacaj();
        }
        if (pozicija == 4) {
            if(brojUkljucenihRingli > this.maxBrojUkljucenihRingli) {
                this.goreDesno.iskljuci();
                this.goreLevo.iskljuci();
                this.doleLevo.iskljuci();
            }
            this.doleDesno.pojacaj();
        }
    }
    public void iskljuci (int pozicija) {
        if (pozicija == 1) {
            this.goreLevo.iskljuci();
        }
        if (pozicija == 2) {
            this.goreDesno.iskljuci();
        }
        if (pozicija == 3) {
            this.doleLevo.iskljuci();
        }
        if (pozicija == 4) {
            this.doleDesno.iskljuci();
        }
    }
    public double ukupnaPotrosnja (int brojSati) {
        return this.goreLevo.potrosnjaElekticneEnergije(brojSati) + this.goreDesno.potrosnjaElekticneEnergije(brojSati) + this.doleLevo.potrosnjaElekticneEnergije(brojSati) + this.doleDesno.potrosnjaElekticneEnergije(brojSati);
    }
    public void stampaj () {
        System.out.println(this.marka + " - " + this.garancija + "god.");
        System.out.println("Ringle: ");
        System.out.println("Gore levo: ");
        this.goreLevo.stampaj();
        System.out.println();
        System.out.println("Gore desno: ");
        this.goreDesno.stampaj();
        System.out.println();
        System.out.println("Dole levo: ");
        this.doleLevo.stampaj();
        System.out.println();
        System.out.println("Dole desno: ");
        this.doleDesno.stampaj();
    }

    public String getMarka () {
        return this.marka;
    }
    public int getGarancija () {
        return this.garancija;
    }
    public int getMaxBrojUkljucenihRingli () {
        return this.maxBrojUkljucenihRingli;
    }
    public Ringla getGoreLevo () {
        return this.goreLevo;
    }
    public Ringla getGoreDesno () {
        return this.goreDesno;
    }
    public Ringla getDoleLevo () {
        return this.doleLevo;
    }
    public Ringla getDoleDesno () {
        return this.doleDesno;
    }
}
