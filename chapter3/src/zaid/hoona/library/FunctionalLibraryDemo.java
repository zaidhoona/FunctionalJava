package zaid.hoona.library;

import java.util.Random;

/**
 * Created by zaid on 7/1/16.
 */
public class FunctionalLibraryDemo {

    public static Library initLibrary() {
        Random random = new Random();
        Library library = new Library();
        library.addBook(new Book("J K Rowling", "Harry Potter", Book.Genre.FICTIONAL));
        library.addBook(new Book("Marcel Proust", "In Search of Lost Time", Book.Genre.HORROR));
        library.addBook(new Book("James Joyce", "Ulysses", Book.Genre.TECHNICAL));
        library.addBook(new Book("Miguel de Cervantes", "Don Quixote by", Book.Genre.COMEDY));
        library.addBook(new Book("William Shakespeare", "Hamlet", Book.Genre.FICTIONAL));
        library.addFeaturedBook("For Fans!", library.books.get(random.nextInt(library.books.size())));
        library.addFeaturedBook("Must Read", library.books.get(random.nextInt(library.books.size())));
        return library;
    }

    public static void main(String[] args) {
        Library library = initLibrary();

        //Functional Iteration
        System.out.println("Books:");
        library.books.forEach(System.out::println);

        System.out.println("\nFeatured:");
        library.featuredBooks.forEach((message, book) -> System.out.println(message + " :- " + book.toString()));
    }
}
