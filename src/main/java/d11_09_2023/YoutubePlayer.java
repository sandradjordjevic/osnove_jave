package d11_09_2023;

public class YoutubePlayer {
    private Video video;
    private int kvalitetVidea;
    private String rezim;
    private int jacina;
    private int trenutnoVremeVidea;

    public YoutubePlayer () {
        this.jacina = 75;
        this.kvalitetVidea = 144;
        this.rezim = "mini player";
    }
    public void ucitajVideo (Video video) {
        this.video = video;
        this.trenutnoVremeVidea = 0;
        this.video.pogledaj();
    }
    public void pojacaj () {
        this.jacina += 10;
        if(this.jacina > 100) {
            this.jacina = 100;
        }
    }
    public void smanji () {
        this.jacina -= 10;
        if (this.jacina < 0) {
            this.jacina = 0;
        }
    }
    public void postaviKvalitet (int brzinaInterneta) {
        if(brzinaInterneta < 2) {
            this.kvalitetVidea = 144;
        } else if (brzinaInterneta >= 2 && brzinaInterneta <= 4) {
            this.kvalitetVidea = 240;
        } else if (brzinaInterneta > 4 && brzinaInterneta <= 6) {
            this.kvalitetVidea = 360;
        } else if (brzinaInterneta > 6 && brzinaInterneta <= 8) {
            this.kvalitetVidea = 720;
        } else {
            this.kvalitetVidea = 1080;
        }
    }
    public void aktivirajMiniPlayerMod () {
        this.rezim = "mini player";
    }
    public void aktivirajBioskopskiMod () {
        this.rezim = "biskopski rezim";
    }
    public void aktivirajPrekoCelogEkranaMod () {
        this.rezim = "preko celog ekrana";
    }
    public void premotajUnapred () {
        this.trenutnoVremeVidea += 10;
        if(this.trenutnoVremeVidea > this.video.getDuzina()) {
            this.trenutnoVremeVidea = this.video.getDuzina();
        }
    }
    public void premotajUnazad () {
        this.trenutnoVremeVidea -= 10;
        if(this.trenutnoVremeVidea < 0) {
            this.trenutnoVremeVidea = 0;
        }
    }
    public void iscrtajZvuk () {
        System.out.print("<:");
        for (int i = 1; i <= jacina / 10; i++) {
            if(i < jacina / 10) {
                System.out.print("|");
            } else {
                System.out.println("|");
            }
        }
    }
    public void iscrtajRezim () {
        if (this.rezim.equals("mini player")) {
            System.out.println("[ ]");
        }
        if (this.rezim.equals("bioskopski rezim")) {
            System.out.println("[ ..]");
        }
        if (this.rezim.equals("preko celog ekrana")) {
            System.out.println("[||||]");
        }
    }
    public void iscrtajTrenutnoVreme () {
        int minut = this.trenutnoVremeVidea / 60;
        int sekund = this.trenutnoVremeVidea % 60;
        int minutUkupno = this.video.getDuzina() / 60;
        int sekundUkupno = this.video.getDuzina() % 60;
        System.out.print(minut + ":" + sekund + " / " + minutUkupno + ":" + sekundUkupno);
    }
    public void iscrtajTimeline () {
        for (int i = 0; i < 100; i++) {
            if (i < (this.trenutnoVremeVidea * 100 / this.video.getDuzina())) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    }
    public void iscrtajSve () {
        this.iscrtajTrenutnoVreme();
        System.out.print(" Zvuk: ");
        this.iscrtajZvuk();
        System.out.print("Timeline: ");
        this.iscrtajTimeline();
        System.out.println("Kvalitet: " + this.kvalitetVidea + "p");
        System.out.print("Rezim: ");
        this.iscrtajRezim();
        this.video.print();

    }
    public String seruj () {
        return "https://youtu.be/" + this.video.getId();
    }
    public void print () {
        System.out.println("Kvalitet: " + this.kvalitetVidea);
        System.out.println("Rezim: " + this.rezim);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea);
        System.out.println("Naziv videa: " + this.video.getNaziv());
        System.out.println("Broj pregleda: " + this.video.getBrojPregleda());
    }

    public Video getVideo () {
        return this.video;
    }
    public int getKvalitetVidea () {
        return this.kvalitetVidea;
    }
    public String getRezim () {
        return this.rezim;
    }
    public int getJacina () {
        return this.jacina;
    }
    public int getTrenutnoVremeVidea () {
        return  trenutnoVremeVidea;
    }

}
