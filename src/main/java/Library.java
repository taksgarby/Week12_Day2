import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    private int capacity;

    public Library(ArrayList<Book> books, int capacity) {
        this.books = books;
        this.capacity = capacity;

    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public boolean fullCapacityCheck() {
        if (this.capacity >= books.size()) {
            return true;
        }
        return false;
    }

    public Book removeBook() {
        return books.remove(0);
    }
}
