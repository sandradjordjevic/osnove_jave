package d17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati program koji simulira formatiranje teksta sa slacka. Program od informacija ucitava:
//        rec koju formatira
//        tip formatiranja
//        link za linkovanu rec (opciono se unosi)
//        Program vrsi formatiranje u HTML-u i podrzava 4 tipa formatiranja: bold italic link code
//        Ukoliko se izabere bold tip, program rec obuhvati b tagom. Npr: rec Hello se formatira u <b>Hello</b>
//        Ukoliko se izabere italic tip, program rec obuhvati em tagom. Npr: rec Hello se formatira u <em>Hello</em>
//        Ukoliko se izabere code tip, program rec obuhvati codetagom. Npr: rec Hello se formatira u <code>Hello</code>
//        Ukoliko se izabere linktip, program od korisnika dodatno trazi da unese link na koji treba da vodi linkovana
//        rec i linkuje rec a tagom. Npr: rec Googlese formatira u <a href='https://google.com'>Google</a>
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rec: ");
        String rec = s.next();
        System.out.println("Unesite tip formatiranja: ");
        String tipFormatiranja = s.next();

        if(tipFormatiranja.equals("bold")){
            System.out.println("<b>" + rec + "</b>");
        }
        if(tipFormatiranja.equals("italic")){
            System.out.println("<em>" + rec + "</em>");
        }
        if(tipFormatiranja.equals("code")){
            System.out.println("<code>" + rec + "</code>");
        }
        if(tipFormatiranja.equals("link")){
            System.out.println("Unesite link: ");
            String link = s.next();
            System.out.println("<a href='" + link + "'>" + rec + "</a>");
        }
    }
}

