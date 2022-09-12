public class Main {
    public static void main(String[] args) {
     Author author = new Author("Pyshkin Aleksandr Sergeevich");
     Book poltava = new Book(author, 1828, "Poltava");
        poltava.getPublisherYear(1828);
        System.out.println(poltava);

     Author block = new Author("Block Aleksandr Aleksandrovich");
     Book ramzes = new Book(author, 1921, "Ramzes");
        ramzes.getPublisherYear(1921);
        System.out.println(ramzes);
    }
}