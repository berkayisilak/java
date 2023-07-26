package Collection.BookSorter;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books1 = new TreeSet<>();
        books1.add(new Book("Nexus", "Ramez NAAM", 534,"2012"));
        books1.add(new Book("Crux", "Ramez NAAM", 568,"2013"));
        books1.add(new Book("Apex", "Ramez NAAM", 656,"2015"));
        books1.add(new Book("Atomic Habits", "James CLEAR", 320,"2019"));
        books1.add(new Book("Kürk Mantolu Madonna", "Sabahattin ALİ", 177,"1943"));

        for (Book book : books1) {
            System.out.println("Name: " + book.getBookName() + ", Author: " + book.getAuthorName() + ", Page Number: " + book.getPageNumber() + ", Publish Date: " + book.getPublishDate());
        }
        System.out.println("---------------------------------------------------------");
        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        books2.add(new Book("Nexus", "Ramez NAAM", 534,"2012"));
        books2.add(new Book("Crux", "Ramez NAAM", 568,"2013"));
        books2.add(new Book("Apex", "Ramez NAAM", 656,"2015"));
        books2.add(new Book("Atomic Habits", "James CLEAR", 320,"2019"));
        books2.add(new Book("Kürk Mantolu Madonna", "Sabahattin ALİ", 177,"1943"));

        for (Book book : books2) {
            System.out.println("Name: " + book.getBookName() + ", Author: " + book.getAuthorName() + ", Page Number: " + book.getPageNumber() + ", Publish Date: " + book.getPublishDate());
        }
    }
}
