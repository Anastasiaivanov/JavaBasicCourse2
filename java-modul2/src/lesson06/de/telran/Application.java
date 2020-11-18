package lesson06.de.telran;

public class Application {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter part 1", "Rowling, J. K.", 2020, 368, Genre.CHILDREN, Cover.HARD);
        Book b2 = new Book("The Haunting of Hill House", "Jackson, Shirley", 2019, 256, Genre.HORROR, Cover.POCKET);
        Book b3 = new Book("Normal People", "Rooney, Sally", 2020, 288, Genre.ROMANCE, Cover.SOFT);
        Book b4 = new Book("A Cosmology of Monsters", "Hamill, Shaun", 2020, 329, Genre.HORROR, Cover.SOFT);
        Book b5 = new Book("The Unadoptables", "Tooke, Hana", 2020, 655, Genre.ADVENTURE, Cover.EBOOK);
        Book b6 = new Book("Midnight Sun", "Meyer, Stephenie", 2018, 768, Genre.FANTASY, Cover.POCKET);

        Library myLib = new Library(6);
        myLib.addBook(b1);
        myLib.addBook(b2);
        myLib.addBook(b3);
        myLib.addBook(b4);
        myLib.addBook(b5);
        myLib.addBook(b6);
        //System.out.println(myLib.binarySearchBooks(2020));

        myLib.displayBooksByAuthor("Rowling, J. K.");
        myLib.displayBooksByCover(Cover.POCKET);
        myLib.displayBooksByGenre(Genre.HORROR);
    }
}
