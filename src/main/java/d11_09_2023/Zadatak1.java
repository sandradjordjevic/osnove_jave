package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//        -godina izdanja
//        -autor
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.

        Author author1 = new Author("Ivo", "Andric");
        author1.print();
        Author author2 = new Author("Tamara", "Kucan");
        author2.print();
        Author author3 = new Author("Mesa", "Selimovic");
        author3.print();

        Book book1 = new Book("978-0-76899", "Na Drini cuprija", 1945, author1);
        Book book2 = new Book("9110-12344", "Profajler", 2017, author2);
        Book book3 = new Book("123-0-4567", "Tvrdjava", 1970, author3);
        Book book4 = new Book("321-0-7654", "Tisine", 1961, author3);
        Book book5 = new Book("977-0-77899", "Prokleta avlija", 1954, author1);
        Book book6 = new Book("564-12344", "Indigo", 2016, author2);
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
        book4.printInfo();
        book5.printInfo();
        book6.printInfo();
    }
}
