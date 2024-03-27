package minitest_book;

public class BookTest {
    public static void main(String[] args) {

        // 5 cuốn sách thuộc lớp minitest_book.ProgrammingBook
        ProgrammingBook[] programmingBooksArr = new ProgrammingBook[5];

        programmingBooksArr[0] = new ProgrammingBook("BC001", "How To Get Rich", 19.9, "Bill Gates", "English", "Fantasy");

        programmingBooksArr[1] = new ProgrammingBook("BC0002", "Cook Like a Masterchef", 6.4, "Gordon Ramsay", "English", "Tutorial");

        programmingBooksArr[2] = new ProgrammingBook("BC003", "The Art of War", 12.5, "Sun Tzu", "Chinese", "Action");

        programmingBooksArr[3] = new ProgrammingBook("BC004", "Hào Quang Rực Rỡ", 99.9, "Trấn Thành", "Vietnamese", "Drama");

        programmingBooksArr[4] = new ProgrammingBook("BC005", "Castle of Love", 5.1, "Mr. Đàm", "Vietnamese", "Romance");

        // 5 cuốn sách thuộc lớp Fictionbook
        FictionBook[] fictionBooksArr = new FictionBook[5];

        fictionBooksArr[0] = new FictionBook("BC011", "Doraemon", 7.4, "Fujiko Fujio", "Fantasy");

        fictionBooksArr[1] = new FictionBook("BC012", "Harry Potter", 7.5, " J.K. Rowling", "Fantasy");

        fictionBooksArr[2] = new FictionBook("BC013", "Fifty Shades of Grey", 6.9, "E. L. James", "Romance");

        fictionBooksArr[3] = new FictionBook("BC014", "Đắc Nhân Tâm", 3.3, "Dale Carnegie", "Self-help");

        fictionBooksArr[4] = new FictionBook("BC015", "Journey To The West", 8.1, "Wu Cheng'en", "Adventure-Fantasy");

        // tính tổng 10 cuốn sách
        double totalPrice = 0.0;
        for (ProgrammingBook book : programmingBooksArr) {
           totalPrice += book.getPrice();
        }
        for (FictionBook book : fictionBooksArr) {
            totalPrice += book.getPrice();
        }

        System.out.println("Tổng tiền của 10 cuốn sách là: " + totalPrice);
        System.out.println();

        // Đếm số sách ProgrammingBook có language là English
        int englishBookCount = 0;
        for (ProgrammingBook book : programmingBooksArr) {
            if (book.getLanguage().equals("English")) {
                englishBookCount++;
            }
        }
        System.out.println("Số sách Programming có language là English: " + englishBookCount);
        System.out.println();

        // Đếm số sách Fiction có category là Fantasy
        int fantasyBookCount = 0;
        for (FictionBook book : fictionBooksArr) {
            if (book.getCategory().equals("Fantasy")) {
                fantasyBookCount++;
            }
        }
        System.out.println("Số sách Fiction có category là viễn tưởng: " + fantasyBookCount);
        System.out.println();

        // Đếm số sách Fiction có giá < 7
        int priceBookCount = 0;
        for (FictionBook book : fictionBooksArr) {
            if (book.getPrice() < 7) {
                priceBookCount++;
            }
        }
        System.out.println("Số sách Fiction có price < 7 là: " + priceBookCount);
        System.out.println();

        // Triển khai 2 phương thức abstract
        Book programmingBooks = new ProgrammingBook("BC001", "How to get rich", 19.9, "Bill Gates", "English", "Fantasy");

        Book fictionBooks = new FictionBook("BC012", "Harry Potter", 7.5, " J.K. Rowling", "Fantasy");

        programmingBooks.bookInfo();
        fictionBooks.bookInfo();
    }
}
