package minitest_book;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

//    public minitest_book.ProgrammingBook(String language, String framework) {
//        this.language = language;
//        this.framework = framework;
//    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public void bookInfo() {
        System.out.println("Đây là sách programming");
    }
}
