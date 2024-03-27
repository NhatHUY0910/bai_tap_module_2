package minitest_book;

public class FictionBook extends Book{
    private String category;

//    public minitest_book.FictionBook(String category) {
//        this.category = category;
//    }

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void bookInfo() {
        System.out.println("Đây là sách fiction");
    }
}
