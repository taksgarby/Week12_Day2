import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;


    public Library(ArrayList<Book> books) {
        this.books = books;

    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public boolean capacityCheck() {
        
    }
}
