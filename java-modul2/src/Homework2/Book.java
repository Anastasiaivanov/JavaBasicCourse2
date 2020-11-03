package Homework2;

public class Book {
    /*Create a book class with the required fields.
    For example, the title, year, author. Create a few
    instance of the book: "War and Peace", "Pride and Prejudice",
     "Inferno" (Dante), "Effective Java", ect.*/
    String title;
    String author;
    int pages;
    int year;
    String publisher;

    void isReading() {
        System.out.println("The book is taking to read");
    }

    void inLibrary() {
        System.out.println("The book is in the library");
    }

    void repair() {
        System.out.println("The book is repairing");
    }

    void displayInfo() {
        System.out.println("A title of book is " + title);
        System.out.println("An author of book is " + author);
        System.out.println("A publisher of book is " + publisher);
        System.out.println("Numbers of pages in the book are " + pages);
        System.out.println("A year of publishing this book is " + year);
    }

    public Book(String booksTitle, String booksAuthor, String booksPublisher, int booksYear, int numberOfPages) {
        title = booksTitle;
        author = booksAuthor;
        publisher = booksPublisher;
        year = booksYear;
        pages = numberOfPages;

    }
}

class BooksTest {
    public static void main(String[] args) {
        Book b1 = new Book("War and peace", "Tolstoy", "Classics", 2012, 1250);
        Book b2 = new Book("Pride and Prejudice", "Ostin", "Tutorial", 2015, 654);
        Book b3 = new Book("Inferno", "Dante", "MIF", 1986, 942);
        Book b4 = new Book("Effective Java", "Bloch", "IT-World", 2019, 457);
        b1.displayInfo();
        b1.inLibrary();
        System.out.println("--------------");
        b2.displayInfo();
        b2.isReading();
        System.out.println("--------------");
        b3.displayInfo();
        b3.repair();
        System.out.println("--------------");
        b4.isReading();
        b4.displayInfo();
    }
}
