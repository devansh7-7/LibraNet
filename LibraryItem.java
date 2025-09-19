import java.util.*;

public abstract class LibraryItem {
    protected int itemId;
    protected String title;
    protected String author;
    protected boolean isAvailable;
    protected Date borrowedDate;

    protected static final int FINE_PER_DAY = 10; // ₹10 per day
    protected static final Map<Integer, Integer> fines = new HashMap<>();

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrow(String durationStr) {
        if (!isAvailable) {
            throw new IllegalStateException("Item already borrowed.");
        }

        try {
            int durationDays = parseDuration(durationStr);
            borrowedDate = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(borrowedDate);
            cal.add(Calendar.DATE, durationDays);
            isAvailable = false;

            System.out.println(title + " borrowed for " + durationDays + " days.");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid duration format.");
        }
    }

    public void returnItem() {
        if (isAvailable) {
            throw new IllegalStateException("Item was not borrowed.");
        }

        long daysOverdue = calculateDaysOverdue();
        if (daysOverdue > 0) {
            int fine = (int) daysOverdue * FINE_PER_DAY;
            fines.put(itemId, fine);
            System.out.println("Item is overdue. Fine: ₹" + fine);
        } else {
            System.out.println("Item returned on time. No fine.");
        }

        isAvailable = true;
        borrowedDate = null;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getFine() {
        return fines.getOrDefault(itemId, 0);
    }

    protected long calculateDaysOverdue() {
        Date now = new Date();
        long diff = now.getTime() - borrowedDate.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        return Math.max(0, days - 7); // Suppose 7 days is allowed
    }

    protected int parseDuration(String duration) {
        return Integer.parseInt(duration.replaceAll("[^0-9]", ""));
    }

    public abstract void displayInfo();
}

