package model;

public class BorrowedBook extends Book {
    private String borrowerName;
    private String borrowedDate;

    public BorrowedBook(String id, String title, String author, String location, String borrowerName, String borrowedDate) {
        super(id, title, author, location);
        this.borrowerName = borrowerName;
        this.borrowedDate = borrowedDate;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getBorrowedDate() {
        return borrowedDate;
    }

    @Override
    public boolean isAvailable() {
        return false; // Buku yang dipinjam tidak tersedia
    }
}
