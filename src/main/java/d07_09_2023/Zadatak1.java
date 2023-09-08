package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Zadatak 1: Kreiranje klase "Student"
//        Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i
//        fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti.
//        Ispisati informacije o studentima.

        Student student1 = new Student();
        student1.ime = "Sandra Djordjevic";
        student1.brojIndexa = 2331;
        student1.fakultet = "Gradjevinsko-arhitektonski fakultet";
        System.out.println("Student: " + student1.ime + ", broj indexa: " + student1.brojIndexa);
        System.out.println("Fakultet: " + student1.fakultet);

        Student student2 = new Student();
        student2.ime = "Marko Markovic";
        student2.brojIndexa = 1997;
        student2.fakultet = "Masinski fakultet";
        System.out.println("Student: " + student2.ime + ", broj indexa: " + student2.brojIndexa);
        System.out.println("Fakultet: " + student2.fakultet);

        Student student3 = new Student();
        student3.ime = "Petar Petrovic";
        student3.brojIndexa = 2222;
        student3.fakultet = "Ekonomski fakultet";
        System.out.println("Student: " + student3.ime + ", broj indexa: " + student3.brojIndexa);
        System.out.println("Fakultet: " + student3.fakultet);
    }
}
