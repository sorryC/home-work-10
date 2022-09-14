public class Main {
    public static void main(String[] args) {
        Author author1 = new Author( "Stephen", "King");
        Author author2 = new Author("Jack", "London");

        Book book1 = new Book("Pet cemetery", author1, 2000);
        Book book2 = new Book("White Fang", author2, 1998);

        book1.setYearPublic(2012);
        System.out.println(book1.getAuthor().getAuthorName());
        System.out.println(book1.getYearPublic());
        System.out.println(book1);
    }
}