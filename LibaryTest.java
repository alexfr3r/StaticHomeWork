package StaticHomeWork;

public class LibaryTest {
    public static void main(String[] args) {
        Libary book = new Libary();
        System.out.println(book.category);
        book.setCategory("Horror");
        System.out.println(book.category);
        System.out.println(book.getCategory());
        book.setYear(2026);
        System.out.println(book.year);
        book.setAuthor("Pushkin");
        System.out.println(book.getAuthor());
        book.setBookTitle("Voina i Mir");
        System.out.println(book.getBookTitle());
        book.author = "Tolstoi";
        System.out.println(book.author);


    }
}
