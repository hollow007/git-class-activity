package za.ac.cput.domain;

import java.time.Duration;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * BookTest.java
 *
 * @author Cavan Swartz (221055835@mycput.ac.za)
 * @version 1.0
 * @since 2024-02-24
 * @see <a href="https://github.com/hollow007/git-class-activity">Cavan Swartz' Github Repository</a>
 */
public class BookTest {

    @Test
    public void testObjectEquality() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);

        assertEquals(book1, book2);
    }

    @Test
    public void testObjectIdentity() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);

        assertNotSame(book1, book2);
    }

    @Test
    public void testFailingTest() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 249.99);

        assertNotEquals(book1, book2);
    }

    @Test
    public void testTimeout() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);

        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
            assertEquals(book1, book2);
        });
    }

    @Test
    @Disabled("This test is disabled for now")
    public void testDisablingTest() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 299.99);

        assertEquals(book1, book2);
    }

    public static void main(String[] args) {

    }
}