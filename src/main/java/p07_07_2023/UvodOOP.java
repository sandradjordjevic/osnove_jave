package p07_07_2023;

public class UvodOOP {
    public static void main(String[] args) {

        User m = new User();
        m.ime = "Sandra";
        m.email = "sandra@gmail.com";
        m.starost = 30;
        System.out.println("Ime: " + m.ime);
        System.out.println("Email: " + m.email);
        System.out.println("Starost: " + m.starost);

        User p = new User();
        p.ime = "Petar";
        p.email = "petar@gmail.com";
        p.starost = m.starost + 3;
        System.out.println("Ime: " + p.ime);
        System.out.println("Email: " + p.email);
        System.out.println("Starost: " + p.starost);

        System.out.println("Kraj");
    }
}
