package lesson06.de.telran;

public class Book {
    private String title;
    private String author;
    public int dateOfPublish;
    private int pages;
    private Genre genre;
    private Cover cover;

    public Book(String title, String author, int dateOfPublish, int pages, Genre genre, Cover cover) {
        this.title = title;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
        this.pages = pages;
        this.genre = genre;
        this.cover = cover;
    }

    public Genre getGenre() {
        return genre;
    }

    public Cover getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(int dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return title +
                ", author: " + author;
    }
}
