package lesson03;

import java.util.Arrays;

public class BookContinue {
    String title;
    String author;
    int pages;
    int year;
    String publisher;
    String genre;
    int weight;
    double rating;
    int bookmark;

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
        System.out.println("A genre of this book is " + year);
        System.out.println("A weight of this book is " + year);
        System.out.println("A rating of this book is " + year);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double newRating) {
        this.rating = newRating;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String newPublisher) {
        this.publisher = newPublisher;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int newPages) {
        this.pages = newPages;
    }


    public void getRepair() {
        this.repair();
    }

    public void getLibrary() {
        this.inLibrary();
    }

    public int getBookmark() {
        return this.bookmark;
    }

    public void setBookmark(int newBookmark) {
        this.bookmark = newBookmark;
    }

    public BookContinue(String booksTitle) {
        this.title = booksTitle;
    }

    public BookContinue(String booksTitle, String booksAuthor) {
        this.title = booksTitle;
        this.author = booksAuthor;
    }

    public BookContinue(String booksTitle, String booksAuthor, String booksGenre) {
        this.title = booksTitle;
        this.author = booksAuthor;
        this.genre = booksGenre;
    }

    public BookContinue(String booksTitle, String booksAuthor, String booksPublisher,
                        int booksYear) {
        this.title = booksTitle;
        this.author = booksAuthor;
        this.publisher = booksPublisher;
        this.year = booksYear;
    }

    public BookContinue(String booksTitle, String booksAuthor, double booksRating) {
        this.title = booksTitle;
        this.author = booksAuthor;
        this.rating = booksRating;
    }

    public BookContinue(String booksTitle, int numberOfPages, int booksWeight) {
        this.title = booksTitle;
        this.pages = numberOfPages;
        this.weight = booksWeight;
    }

    public BookContinue(String booksTitle, String booksAuthor, String booksPublisher,
                        int booksYear, int numberOfPages) {
        this.title = booksTitle;
        this.author = booksAuthor;
        this.publisher = booksPublisher;
        this.year = booksYear;
        this.pages = numberOfPages;
    }

    public BookContinue(String booksTitle, String booksAuthor, String booksGenre,
                        double booksRating) {
        this.title = booksTitle;
        this.author = booksAuthor;
        this.genre = booksGenre;
        this.rating = booksRating;
    }

    public BookContinue(String booksAuthor, double booksRating) {
        this.author = booksAuthor;
        this.rating = booksRating;
    }

    public BookContinue(String booksTitle, String booksAuthor, String booksPublisher,
                        int booksYear, int numberOfPages, String booksGenre,
                        int booksWeight, double booksRating) {
        this.title = booksTitle;
        this.author = booksAuthor;
        this.publisher = booksPublisher;
        this.year = booksYear;
        this.pages = numberOfPages;
        this.genre = booksGenre;
        this.weight = booksWeight;
        this.rating = booksRating;

    }
}

class BooksTest {
    public static void main(String[] args) {
        BookContinue book1 = new BookContinue("War and peace", "Leo Tolstoy",
                "Russian Classic", 2012, 1250,
                "Classic", 3455, 8.2);
        BookContinue book2 = new BookContinue("Pride and Prejudice", "Jane Austin",
                "Tutorial", 2015, 654,
                "Roman", 455, 9.1);
        BookContinue book3 = new BookContinue("Inferno", "Dante",
                "MIF", 1986, 942,
                "Classic", 1570, 7.5);
        BookContinue book4 = new BookContinue("Effective Java", "Joshua Bloch",
                "IT-World", 2019, 457,
                "Education", 347, 8.3);
        BookContinue book5 = new BookContinue("Clean Code", "Robert Martin",
                "Piter", 2018, 464,
                "Education", 600, 9.17);
        BookContinue book6 = new BookContinue("American Dirt", "Cammins Jennin",
                "Sindbad", 2020, 528,
                "Modern Prose", 590, 9.0);
        BookContinue book7 = new BookContinue("The prince and the pauper", "Mark Twen",
                "Time", 2018, 272,
                "Classic", 200, 8.33);
        BookContinue book8 = new BookContinue("The hound of the Baskervilles", "Artur Conan Doyl",
                "Literature", 2017, 224,
                "Adventure", 166, 9.5);
        BookContinue book9 = new BookContinue("1984", "Georg Orwell",
                "AST", 2012, 320,
                "Modern Prose", 198, 9.07);
        BookContinue book10 = new BookContinue("Ethic", "Aristotel",
                "AST", 1998, 416,
                "Classic", 250, 10.0);

        BookContinue[] allOfBooks = new BookContinue[]{book1, book2, book3, book4, book5,
                book6, book7, book8, book9, book10};

        book1.displayInfo();
        book1.inLibrary();
        System.out.println("--------------");
        book2.displayInfo();
        book2.isReading();
        System.out.println("--------------");
        book3.displayInfo();
        book3.repair();
        System.out.println("--------------");
        book4.isReading();
        book4.displayInfo();

        System.out.println(book1.getTitle());
        book1.setTitle("Война и мир");
        System.out.println(book1.getTitle());
        print(allOfBooks);
    }

    public static void print(BookContinue[] arr) {
        for (BookContinue book : arr) {
            book.displayInfo();
        }
    }
}
