package MiniProjekat;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//  1.	**Zadatak: Simulacija skidanja tekstualnog fajla**
//  Napišite program koji simulira proces skidanja tekstualnog fajla.
//  Skidanje fajla se obavlja u paketima od po 5 karaktera.

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the file size: ");
        double fileSize = s.nextInt();

        ArrayList<String> fullPackage = new ArrayList<>();
        double downloaded = 0;

        for (int i = 0; i < fileSize / 5; i++) {
            System.out.println("Enter the package: ");
            String pack = s.next();
            fullPackage.add(pack);
            downloaded += pack.length() * 100 / fileSize;
            System.out.println("Downloaded: " + Math.round(downloaded) + " %");
        }

        System.out.print("The content of the file is: ");
        for (int i = 0; i < fullPackage.size(); i++) {
            System.out.print(fullPackage.get(i));
        }
    }
}
