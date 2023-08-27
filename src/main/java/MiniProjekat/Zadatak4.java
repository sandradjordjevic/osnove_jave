package MiniProjekat;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//4.**Zadatak: Zamena Vrednosti u Locust Komandi**
//  Komanda je obican String, a vrednosti koje se menjaju su reči napisane velikim slovima i ispred svake od njih se
//  nalazi znak $. Ako u skripti postoji barem jedan znak $, to znači da još uvek postoje promenljive koje treba zameniti.
//  Program od korisnika traži da unese naziv promenljive za zamenu i vrednost koja će biti postavljena umesto te
//  promenljive u komandi. Nakon svake zamene, program će prikazati trenutnu komandu sa izmenama.
//  Komanda koja je koriscena za ovaj primer je
//  locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE
//  Promenljivi delovi komande su
//  ●	$LOCUSTFILE
//  ●	$NUMBER_OF_USERS
//  ●	$SPAWN_RATE
//  ●	$RUN_TIME
//  ●	$HOST
//  ●	$HTML_FILE

        Scanner s = new Scanner(System.in);

        String command = "locust -f $LOCUSTFILE -u $NUMBER_OF_USERS -r $SPAWN_RATE -t $RUN_TIME --headless –host $HOST --html $HTML_FILE";

        while(command.contains("$")) {
            System.out.println("Enter the name of the variable to replace: ");
            String variableToReplace = s.next();
            System.out.println("Enter the value: ");
            String value = s.next();
            command = command.replace(variableToReplace, value);
            System.out.println(command);
        }
    }
}
