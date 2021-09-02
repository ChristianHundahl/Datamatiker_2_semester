import Programmering_30_08_21_Abstract_Data_Types.htmlTag;

import java.util.Objects;

public class Book {
    //ISBN
    //Titel
    //Udgivelsesår
    private String title;
    private int publicationYear;
    private static String ISBN;

    public Book (String title, int publicationYear, String ISBN){
        this.title = title;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
    }
    public String toString(){
        return title + ", " + publicationYear + ", " + ISBN;
    }

    public String getTitle() {
        return title;
    }
    public void setTitel(String newTitle) {
        this.title = newTitle;
    }

    public int getPublicationsYear(){
        return publicationYear;
    }
    public void setPublicationYear(int newPublicationYear){
        this.publicationYear = newPublicationYear;
    }

    public String getIsbn(String thisIsbn){
        return this.ISBN;
    }
    public void setISBN(String newISBN){
        this.ISBN = newISBN;
    }

    //TODO: metode til at finde bogens ISBN
    @Override
    public boolean equals(Object Book) {//
        if (this == Book) return true;
        if (Book == null || getClass() != Book.getClass()) return false;
        Book o = new Book(getIsbn(Book o));
        return Objects.equals(ISBN, Book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
