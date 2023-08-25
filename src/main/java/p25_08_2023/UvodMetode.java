package p25_08_2023;

public class UvodMetode {
    public static void main(String[] args) {
        String ime = "Pera";
        String prezime = "Peric";
        boolean aktivan = true;
    printUser(ime, prezime, aktivan);
        printUser("Sandra", "Djordjevic", true);
    }
    public static void printUser (String firstName, String lastName, boolean active) {
        if(active) {
            System.out.println("o ");
        } else {
            System.out.println("x ");
        }
    }
}
