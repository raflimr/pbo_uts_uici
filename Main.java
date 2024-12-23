import model.Book;
import service.LibraryService;
import util.InputUtil;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        libraryService.addBook(new Book("1", "Filosofi Teras", "Henry Manampiring", "A1"));
        libraryService.addBook(new Book("2", "You do You", "Fellexandro Ruby", "B2"));
        libraryService.addBook(new Book("3", "Atomic Habits", "James Clear", "C3"));

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. View Borrowed Books");
            System.out.println("4. Exit");

            String choice = InputUtil.readString("Choose an option: ");
            switch (choice) {
                case "1":
                    libraryService.listBooks();
                    break;
                case "2":
                    String bookId = InputUtil.readString("Enter Book ID: ");
                    String borrowerName = InputUtil.readString("Enter Borrower's Name: ");
                    String borrowedDate = InputUtil.readString("Enter Borrowed Date (e.g., 2024-12-23): ");
                    libraryService.borrowBook(bookId, borrowerName, borrowedDate);
                    break;
                case "3":
                    libraryService.listBorrowedBooks();
                    break;
                case "4":
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
