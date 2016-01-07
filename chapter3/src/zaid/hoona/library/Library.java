package zaid.hoona.library;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zaid on 7/1/16.
 */
public class Library {
    public List<Book> books;
    public Map<String, Book> featuredBooks;

    public Library() {
        books = new ArrayList<>();
        featuredBooks = new HashMap<>();
    }

    public void addBook(@NotNull Book book) {
        books.add(book);
    }

    public void addFeaturedBook(@NotNull String message, @NotNull Book book) {
        featuredBooks.put(message, book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Map<String, Book> getFeaturedBooks() {
        return featuredBooks;
    }
}
