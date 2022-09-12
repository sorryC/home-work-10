public class Book {
    private Author author;
    private int publisherYear;
    private String bookName;

    public Book(Author author, int publisherYear, String bookName) {
        this.author = author;
        this.publisherYear = publisherYear;
        this.bookName = bookName;
    }

    public int getPublisherYear(int i) {
        return publisherYear;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Книга - " + author +
                ", дата публикации " + publisherYear +
                ", название - " + bookName;
    }
}
