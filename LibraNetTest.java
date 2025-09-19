public class LibraNetTest {
    public static void main(String[] args) {
        Book book = new Book(101, "Atomic Habits", "James Clear", 320);
        Audiobook audiobook = new Audiobook(102, "Deep Work", "Cal Newport", 180);
        EMagazine emag = new EMagazine(103, "NatGeo", "Various", 2025);

        book.displayInfo();
        audiobook.displayInfo();
        emag.displayInfo();

        // Borrowing
        book.borrow("7");
        audiobook.borrow("5");
        emag.borrow("10");

        // Specialized behavior
        System.out.println("Pages in book: " + book.getPageCount());
        audiobook.play();
        emag.archiveIssue();

        // Return after some time (simulate fine)
        book.returnItem();
        System.out.println("Fine for book: ₹" + book.getFine());

        // Try borrowing again
        if (book.isAvailable()) {
            book.borrow("3");
        }
    }
}
