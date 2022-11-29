import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before() {
        Book book1 = new Book("How to cook", "Nigella Lawson", "Cookery");
        Book book2 = new Book("Holes", "Louis Sachar", "Young Adult");
        Book book3 = new Book("Watership Down", "Richard Adams", "Children");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        int capacity = 4;

        library = new Library(books, capacity);
    }

    @Test
    public void countLibraryBooks() {
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canAddBook() {
        Book book4 = new Book("Nat 5 Maths", "Donnie Darko", "Reference");
        library.addBook(book4);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void isCapacityFull() {
        Book book4 = new Book("Nat 5 Maths", "Donnie Darko", "Reference");
        library.addBook(book4);
        assertEquals(true, library.fullCapacityCheck());
    }

    @Test
    public void canRemoveBook() {
        library.removeBook();
        assertEquals(2, library.bookCount());

    }
}
