package MiniProjekat;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//  3.**Zadatak: Zamena Placeholdera u SQL Upitu**
//
//  Napišite program koji obavlja zamenu placeholdera u SQL upitu.Za rešenje ovog zadatka,
//  biće potrebno upoznati se sa upotrebom `replace` metode koju pruža `String` klasa u Javi.
//  Program će sačuvati sledeće informacije:
//  1. SQL upit (string) nad kojim će se obaviti zamena.
//  2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//
//  Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti. Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//
//  INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//  i niz vrednosti je: Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//  Nakon izvršenja zamene, dobiće se SQL upit:
//  INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
//  VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');

        String sqlQuery = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');";

        ArrayList<String> values = new ArrayList<>();
        values.add("Cardinal");
        values.add("Tom B. Erichsen");
        values.add("Skagen 21");
        values.add("Stavanger");
        values.add("4006");
        values.add("Norway");

    for (int i = 0; i < values.size(); i++) {
        String replaceThis = "%" + i;
        sqlQuery = sqlQuery.replace(replaceThis, values.get(i));
    }
        System.out.println(sqlQuery);
    }
}
