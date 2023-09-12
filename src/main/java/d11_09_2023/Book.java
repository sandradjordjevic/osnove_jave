package d11_09_2023;

public class Book {
    private String isbn;
    private String name;
    private int relaseYear;
    private Author author;

    public Book (String isbn, String name, int relaseYear, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.relaseYear = relaseYear;
        this.author = author;
    }
    public void printInfo () {
        System.out.println(this.isbn);
        System.out.println(this.name + " - " + this.relaseYear + ".");
        this.author.print();
    }
    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn () {
        return  this.isbn;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName (String name) {
        return  this.name;
    }
    public void setRelaseYear (int relaseYear) {
        this.relaseYear = relaseYear;
    }
    public int getRelaseYear (int relaseYear) {
        return  this.relaseYear;
    }

}
