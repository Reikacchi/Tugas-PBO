package prak8;

public class LibraryManager {
    private static int totalBooksAvailable = 100;

    public static void addBooks(int count) {
        totalBooksAvailable += count;
        System.out.println(count + " books added.");
    }

    public static void removeBooks(int count) {
        if (count <= totalBooksAvailable) {
            totalBooksAvailable -= count;
            System.out.println(count + " books removed.");
        } else {
            System.out.println("Not enough books available to remove.");
        }
    }

    public static void displayTotalBooks() {
        System.out.println("Total books available: " + totalBooksAvailable);
    }

    public static void main(String[] args) {
        // Example usage to generate the desired output
        addBooks(10);          // Adds 10 books, total should become 110
        removeBooks(5);        // Removes 5 books, total should become 105
        displayTotalBooks();   // Displays the total books available
    }
}
