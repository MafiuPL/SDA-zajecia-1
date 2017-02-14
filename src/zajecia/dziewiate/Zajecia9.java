package zajecia.dziewiate;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        User user = new User("Mateusz", "Janczak", "08.11.1986");
        Address address = new Address("Poznan", "Poznanska", 2, "60-401", "Polska");
        user.address = address;
        user.print();
        String message = "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.";
        Author henrykSienkiewicz = new Author("Henryk", "Sienkiewicz");
        Book book = new Book("Krzyzacy", henrykSienkiewicz, 2005, message.split(" "));
//        book.setCategory("History");
//        book.setDescription("jest spoko");
//        String page = book.getPage(5);
//        System.out.println(page);
        BookShelf bookshelf = new BookShelf();
        bookshelf.add(book);
        Book book2 = new Book("Ogniem i Mieczem", henrykSienkiewicz, 2003, message.split(" "));
        Book book3 = new Book("Lalka", new Author ("Boleslaw",  "Prus"), 2000, message.split(" "));
        Book book4 = new Book("Dziady", new Author("Adam", "Mickiewicz"), 2009, message.split(" "));
        bookshelf.add(book);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);
        ArrayList<Book> booksOf = bookshelf.getBooksOf("Adam Mickiewicz");
        for (Book b : booksOf) {
            System.out.println(b.toString());

        }

        ArrayList<Book> booksOf1 = bookshelf.getBooksFrom(2005);
        for (Book c : booksOf1) {
            System.out.println(c.toString());
        }

        ArrayList<Book> booksOf2 = bookshelf.getBooksSince(2005);
        for (Book d : booksOf2) {
            System.out.println(d.toString());
        }

        ArrayList<Book> booksOf3 = bookshelf.getBooksLongerThan(100);
        for (Book e : booksOf3) {
            System.out.println(e.toString());
        }
    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}

