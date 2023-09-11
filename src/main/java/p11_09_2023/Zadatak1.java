package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setIme("Sandra");
    String ime = s1.getIme();
    s1.setPrezime("Djordjevic");
    String prezime = s1.getPrezime();
    s1.setBrojIndexa(2331);
    int brojIndexa = s1.getBrojIndexa();
    s1.setBudzet(true);
    boolean budzet = s1.getBudzet();
    s1.stampaj();
    }
}
