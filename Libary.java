package StaticHomeWork;

public class Libary {
    // поля
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    // getters
    String getBookTitle() {
        return this.bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    String getCategory() {
        return this.category;
    }

    // setters
    void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    void setAuthor(String newAuthour) {
        this.author = newAuthour;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setCategory(String newCategory) {
        this.category = newCategory;
    }
}
