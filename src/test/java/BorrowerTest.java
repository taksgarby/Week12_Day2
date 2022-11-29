import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;

    @Before
    public void before() {
        borrower = new Borrower("John");
    }

    @Test
    public void hasName() {
        assertEquals("John", borrower.getName());
    }

    @Test
    public void canBorrowBook() {
        Book book1 = new Book("How to cook", "Nigella Lawson", "Cookery");
        borrower.borrow(book1);
        //        ArrayList<Book> borrowedBook = new ArrayList<>();
//        borrowedBook.add(book1);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void borrowFromLibrary() {
        Book book1 = new Book("How to cook", "Nigella Lawson", "Cookery");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        Library library = new Library(books, 5);
        borrower.borrowFromLibrary(library);
        assertEquals(1, borrower.bookCount());
    }

}
