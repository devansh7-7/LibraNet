public class Audiobook extends LibraryItem implements Playable {
    private int durationMinutes;

    public Audiobook(int itemId, String title, String author, int durationMinutes) {
        super(itemId, title, author);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void play() {
        System.out.println("🔊 Playing audiobook: " + title + " [" + durationMinutes + " mins]");
    }

    @Override
    public void displayInfo() {
        System.out.println("🎧 Audiobook: " + title + " by " + author + " | Duration: " + durationMinutes + " mins | Available: " + isAvailable);
    }
}
