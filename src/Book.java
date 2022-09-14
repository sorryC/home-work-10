import java.util.Objects;

public class Book {
    String bookName;
    Author author;
    int yearPublic;



    public Book(String bookName, Author author, int yearPublic) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublic = yearPublic;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearPublic() {
        return yearPublic;
    }
    public void setYearPublic( int yearPublic) {
        this.yearPublic = yearPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublic == book.yearPublic && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearPublic);
    }

    @Override
    public String toString() {
        return
                "Название: " + bookName +
                        " Автор: " + author +
                        " Год публикации: " + yearPublic ;
    }
}