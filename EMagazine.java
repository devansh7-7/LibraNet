public class EMagazine extends LibraryItem {
    private int issueNumber;

    public EMagazine(int itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    public void archiveIssue() {
        System.out.println("🗂️ Archiving issue #" + issueNumber + " of " + title);
    }

    @Override
    public void displayInfo() {
        System.out.println("📰 E-Magazine: " + title + " | Issue: #" + issueNumber + " | Available: " + isAvailable);
    }
}
