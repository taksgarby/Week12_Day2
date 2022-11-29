import java.util.ArrayList;

public class Borrower {

    private String name;

    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void borrow(Book book){
        borrowedBooks.add(book);
    }

    public int bookCount() {
        return borrowedBooks.size();
    }

    public void borrowFromLibrary(Library library) {
        Book bookFromLibrary = library.removeBook();
        borrow(bookFromLibrary);
    }

}
