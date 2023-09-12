package d11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Video v1 = new Video("v6tuOipj5mk", "Coldplay - The Scientist", 265, 1000000, 456, 2000000);
        YoutubePlayer y1 = new YoutubePlayer();

        y1.ucitajVideo(v1);
        y1.print();
        y1.postaviKvalitet(8);
        y1.print();
        y1.aktivirajMiniPlayerMod();
        y1.print();
        y1.aktivirajBioskopskiMod();
        y1.print();
        y1.aktivirajPrekoCelogEkranaMod();
        y1.print();
        y1.premotajUnapred();
        y1.premotajUnapred();
        y1.print();
        y1.premotajUnazad();
        y1.print();
        y1.premotajUnazad();
        y1.premotajUnazad();
        y1.print();
        y1.iscrtajZvuk();
        y1.print();
        y1.iscrtajRezim();
        y1.iscrtajTrenutnoVreme();
        y1.premotajUnapred();
        y1.premotajUnapred();
        y1.premotajUnapred();
        y1.premotajUnapred();
        y1.premotajUnapred();
        y1.premotajUnapred();
        y1.iscrtajRezim();
        y1.iscrtajTrenutnoVreme();
        y1.iscrtajTimeline();
        y1.iscrtajSve();
        String link = y1.seruj();
        System.out.println(link);

    }
}
