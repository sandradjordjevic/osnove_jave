package d24_08_2023;

import java.util.ArrayList;

public class Zadatak6 {
    public static void main(String[] args) {
//        Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod.
//        Ukoliko se actual i expected vrednosti ne poklapaju ispisati gresku u formatu:
//        Assertion Error: Link <link> expected status code <expected code> but got <actual code>

        ArrayList<String> links = new ArrayList<>();
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/shop/");
        links.add("https://cms.demo.katalon.com/account/");
        links.add("https://cms.demo.katalon.com/cart/");
        links.add("https://cms.demo.katalon.com/test/");

        ArrayList<Integer> expectedStatusCodes = new ArrayList<>();
        expectedStatusCodes.add(200);
        expectedStatusCodes.add(200);
        expectedStatusCodes.add(404);
        expectedStatusCodes.add(204);
        expectedStatusCodes.add(200);

        ArrayList<Integer> actualStatusCodes = new ArrayList<>();
        actualStatusCodes.add(200);
        actualStatusCodes.add(200);
        actualStatusCodes.add(400);
        actualStatusCodes.add(200);
        actualStatusCodes.add(404);

        for(int i = 0; i < links.size(); i++) {
            if(!(expectedStatusCodes.get(i).equals(actualStatusCodes.get(i)))) {
                System.out.println("Assertion Error: " + links.get(i) + " expected " + expectedStatusCodes.get(i)
                + " but got " + actualStatusCodes.get(i) );
            }
        }

    }
}
