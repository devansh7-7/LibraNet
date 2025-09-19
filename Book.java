public class Book extends LibraryItem {
    private int pageCount;

    public Book(int itemId, String title, String author, int pageCount) {
        super(itemId, title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("📖 Book: " + title + " by " + author + " | Pages: " + pageCount + " | Available: " + isAvailable);
    }
}

