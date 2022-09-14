import java.util.Objects;

public class Author {
    String authorName;
    String authorSecondName;

    public Author(String authorName, String authorSecondName){
        this.authorName = authorName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorSecondName() {
        return authorSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSecondName.equals(author.authorSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSecondName);
    }

    @Override
    public String toString() {
        return
                authorName + " " +authorSecondName ;
    }
}
