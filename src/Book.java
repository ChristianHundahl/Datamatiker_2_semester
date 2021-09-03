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

    public String getIsbn(){
        return this.ISBN;
    }
    public void setISBN(String newISBN){
        this.ISBN = newISBN;
    }

    //TODO: metode til at finde bogens ISBN
    @Override
    public boolean equals(Object o) {
        if (o instanceof Book) {
        Book other = (Book) o;
        return ISBN == other.ISBN;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
