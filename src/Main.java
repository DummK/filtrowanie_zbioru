import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book("Java Programming", "Kacper Ksykiewicz", 1900));
        books.add(new Book("Java for Everyone", "Kacper Ksykiewicz", 2200));
        books.add(new Book("Java: A Beginner's Guide", "Kacper Ksykiewicz", 2010));
        books.add(new Book("Java: The Complete Reference", "Kacper Ksykiewicz", 2011));
        books.add(new Book("Java: The Object-Oriented Approach", "Kacper Ksykiewicz", 1977));

        for(Book book : books) {
            if(book.getYear() < 2010) {
                System.out.println("Book code: " + book.hashCode() + ", " + book.toString());
            }
        }

    }
}