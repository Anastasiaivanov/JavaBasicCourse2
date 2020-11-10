package lesson06.de.telran;

public class Book {
    private String title;
    private String author;
    private int dateOfPublish;
    private int pages;

    public Book(String title, String author, int dateOfPublish, int pages) {
        this.title = title;
        this.author = author;
        this.dateOfPublish = dateOfPublish;
        this.pages = pages;
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
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateOfPublish=" + dateOfPublish +
                ", pages=" + pages +
                '}';
    }
}
