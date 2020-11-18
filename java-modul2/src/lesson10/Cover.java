package lesson10;

public enum Cover {
    HARD("Hard"),
    EBOOK("E-book"),
    SOFT("Broshüre"),
    POCKET("Pocketbook");

    private String title;

    private Cover(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "title='" + title + '\'' +
                '}';
    }
}
