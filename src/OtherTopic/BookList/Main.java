package OtherTopic.BookList;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Map<String, String> mapBooks = new TreeMap<>();
        books.add(new Book("book1", 10, "author1", LocalDate.of(2001,1,1)));
        books.add(new Book("book2", 20, "author2", LocalDate.of(2002,2,2)));
        books.add(new Book("book3", 30, "author3", LocalDate.of(2003,3,3)));
        books.add(new Book("book4", 40, "author4", LocalDate.of(2004,4,4)));
        books.add(new Book("book5", 50, "author5", LocalDate.of(2005,5,5)));
        books.add(new Book("book6", 60, "author6", LocalDate.of(2006,6,6)));
        books.add(new Book("book7", 70, "author7", LocalDate.of(2007,7,7)));
        books.add(new Book("book8", 80, "author8", LocalDate.of(2008,8,8)));
        books.add(new Book("book9", 90, "author9", LocalDate.of(2009,9,9)));
        books.add(new Book("book10", 100, "author10", LocalDate.of(2010,10,10)));

        books.forEach(book -> mapBooks.put(book.getBookName(), book.getAuthorName()));
        mapBooks.forEach((name, author) -> System.out.println("Book Name: " + name + ", Author Name: " + author));

        List<Book> booksForPageNumber = books.stream().filter(book -> book.getPageNumber() >= 60).toList();
        booksForPageNumber.forEach(book -> System.out.println("Book Name: " + book.getBookName() + ",Page Number: " + book.getPageNumber()));
    }
}
