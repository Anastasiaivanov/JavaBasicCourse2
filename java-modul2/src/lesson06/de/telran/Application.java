package lesson06.de.telran;

public class Application {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter1", "Joan Rowling", 2010, 436);
        Book b2 = new Book("Harry Potter2", "Joan Rowling", 2012, 510);
        Book b3 = new Book("Harry Potter3", "Joan Rowling", 2014, 645);
        Book b4 = new Book("Harry Potter4", "Joan Rowling", 2016, 655);

        Library myLib = new Library(4);
        //System.out.println("Size is " + myLib.getSize());
        myLib.addBook(b1);
        //System.out.println("Size is " + myLib.getSize());
        myLib.display();
        myLib.addBook(b2);
        myLib.addBook(b3);
        myLib.addBook(b4);
       /* myLib.display();
        myLib.deleteBookFromArray(b2);
        System.out.println("Delete 2 book, first index");
        myLib.display();
        myLib.getSize();*/
        myLib.sortBooks();
        myLib.display();
        System.out.println(myLib.binarySearchBooks(b1));
    }
}
