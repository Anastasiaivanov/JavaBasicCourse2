package lesson06.de.telran;

public class Library {
    private Book[] books;
    private int size;

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }

    public void displayBooksByGenre(Genre genre) {
        for (int i = 0; i < books.length; i++) {
            Genre temp = books[i].getGenre();
            if (temp.equals(genre)) {
                System.out.println("This genre: " + genre + " have this book: " + books[i]);
            }
        }
    }
    public void displayBooksByCover(Cover cover) {
        for (int i = 0; i < books.length; i++) {
            Cover temp = books[i].getCover();
            if (temp.equals(cover)) {
                System.out.println("This cover: " + cover + " have this book: " + books[i]);
            }
        }
    }
    public void displayBooksByAuthor(String author){
        for (int i = 0; i < books.length; i++) {
            String temp = books[i].getAuthor();
            if(temp.equals(author)){
                System.out.println("This author: " + author + " wrote this book: " + books[i]);
            }
        }
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBookFromArray(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayDeleteBook() {
        System.out.println(books[size - 1]);
        System.out.println(books[size]);
        System.out.println(books[size + 1]);
    }

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void sortBooks() {
        int count = 0;
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getDateOfPublish() > books[i + 1].getDateOfPublish()) {
                Book temp = books[i];
                books[i] = books[i + 1];
                books[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            sortBooks();
        }
    }

    public int binarySearchBooks(int dateOfPublish) {
        int bookPosition = -1;
        int lowIndex = 0;
        int highIndex = books.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (dateOfPublish == books[middleIndex].getDateOfPublish()) {
                bookPosition = middleIndex;
                break;
            } else if (dateOfPublish < books[middleIndex].getDateOfPublish()) {
                highIndex = middleIndex - 1;
            } else if (dateOfPublish > books[middleIndex].getDateOfPublish()) {
                lowIndex = middleIndex + 1;
            }
        }
        return bookPosition;
    }
}
