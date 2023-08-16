package d15_02_2023;

public class Zadatak10 {
    public static void main(String[] args) {
//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl. Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja. Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
//        Primer izvrsenja
//        File: profile-image.log
//        Size: 25Mb
//        Download speed: 3Mb/s
//        Estimated time: 8s
        String file = "profile-image.log";
        int size = 25;
        int downloadSpeed = 3;
        System.out.println("File: " + file);
        System.out.println("Size: " + size + "Mb");
        System.out.println("Download Speed: " + downloadSpeed + "Mb/s");
        System.out.println("Estimated time: " + size / downloadSpeed + "s");
    }
}
