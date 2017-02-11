package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book get(int index) {
        if (index >= 0 && index < books.size()) {
            return this.books.get(index);
        }
        return null;
    }

    public void add(Book book) {
        this.books.add(book);
    }

//    public ArrayList<Book> getBooksOf(String author) {
//        ArrayList<Book> booksTmp = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getAuthor().equals(author)) {
//                booksTmp.add(book);
//            }
//        }
//        return booksTmp;
//
//    }

    public ArrayList<Book> getBooksFrom(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() == (releaseDate)) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksSince(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() >= (releaseDate)) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksLongerThan(int numberOfPages) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getNumberOfPages() >= numberOfPages) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksOf(String author) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            Author authorOfBook = book.getAuthor();
            boolean searchRequirement =
                    authorOfBook.getFirstName().startsWith(author) ||
                            authorOfBook.getLastName().startsWith(author) ||
                            (authorOfBook.getLastName() + " " + authorOfBook.getFirstName()).startsWith(author) ||
                            authorOfBook.toString().startsWith(author);
            if (searchRequirement) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }
}
