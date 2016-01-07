package zaid.hoona.library;

import com.sun.istack.internal.NotNull;

/**
 * Created by zaid on 7/1/16.
 */
public class Book {
    private final String author;
    private final String title;
    private final Genre genre;

    public static enum Genre {
        HORROR, COMEDY, TECHNICAL, FICTIONAL;
    }

    public Book(@NotNull String author, @NotNull String title, @NotNull Genre genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + "(" + genre.toString().toLowerCase() + ")";
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result += 11 * author.hashCode();
        result += 17 * genre.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj == this) return true;

        if(!(obj instanceof Book)) return false;

        final Book book = (Book) obj;

        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        if (!genre.equals(book.genre)) return false;

        return true;
    }
}
