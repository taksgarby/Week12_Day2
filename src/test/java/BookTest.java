import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("How to cook", "Nigella Lawson", "Cookery");

    }

    @Test
    public void bookHasTitle() {
        assertEquals("How to cook", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Nigella Lawson", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Cookery", book.getGenre());
    }
}
