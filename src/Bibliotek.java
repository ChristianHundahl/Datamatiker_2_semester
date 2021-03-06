import java.util.ArrayList;

public class Bibliotek {

    public static void main(String[] args) {
        //Lav en arraylist med bøger
        ArrayList<Book> bibliotek = new ArrayList<Book>();
        //Indsæt tre bøger i listen
        Book Book2 = new Book("Gravity's Rainbow", 1974, "9780224009621");
        Book Book3 = new Book("The Militant Muse", 2017, "9780500239681");
        Book Book1 = new Book("Java for Dummies", 2017, "9780470371732");
        Book Book4 = new Book("SQL for Dummies", 2017, "9780470371732");
        bibliotek.add(Book1);
        bibliotek.add(Book2);
        bibliotek.add(Book3);
        bibliotek.add(Book4);
        //boolean bool = Book1.equals(Book4);
        for (Book findThis : bibliotek){
            if (bibliotek.contains("9780470371732")){
                System.out.println("Book found");
            }
            else{
                System.out.println("Book not here");
            }
        }

        //System.out.println(bool);
    }
    //Måske løsning: https://stackoverflow.com/questions/66972456/check-if-parameter-is-duplicated-in-a-list
    //Skriv en metode der returnerer True hvis en bog med dette ISBN er på listen.
    public static void doesListContain(Book book, ArrayList<Book> bibliotek) {
        for (Book b : bibliotek)
            if (b.getIsbn().equals(book.getIsbn()))
                System.out.println("Book here");
            else
                System.out.println("Not here");
        }
    }