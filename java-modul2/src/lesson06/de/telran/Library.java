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

    public boolean addBook(Book kniga) {
        if (size < books.length) {
            books[size] = kniga;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBookFromArray(Book kniga) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(kniga)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayDeleteBook(){
        System.out.println(books[size-1]);
        System.out.println(books[size]);
        System.out.println(books[size+1]);
    }

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }
}
