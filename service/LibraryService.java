package service;

import model.Book;
import model.BorrowedBook;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private List<BorrowedBook> borrowedBooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public void borrowBook(String bookId, String borrowerName, String borrowedDate) {
        Book book = findBookById(bookId);
        if (book != null) {
            if (book.isAvailable()) {
                books.remove(book); // Hapus buku dari daftar buku yang tersedia
                BorrowedBook borrowedBook = new BorrowedBook(
                        book.getId(), book.getTitle(), book.getAuthor(), book.getLocation(), borrowerName, borrowedDate);
                borrowedBooks.add(borrowedBook); // Tambahkan ke daftar buku yang dipinjam
                System.out.println("Book borrowed successfully by " + borrowerName + " on " + borrowedDate + "!");
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void listBooks() {
        // Daftar buku yang tersedia
        System.out.println("Available Books:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.printf("ID: %s | Title: %s | Author: %s | Location: %s%n",
                        book.getId(), book.getTitle(), book.getAuthor(), book.getLocation());
            }
        }

        // Separator untuk memisahkan kategori
        System.out.println("-----------------------------");

        // Daftar buku yang dipinjam
        System.out.println("Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books have been borrowed.");
        } else {
            for (BorrowedBook borrowedBook : borrowedBooks) {
                System.out.printf("ID: %s | Title: %s | Borrower: %s | Date: %s%n",
                        borrowedBook.getId(), borrowedBook.getTitle(),
                        borrowedBook.getBorrowerName(), borrowedBook.getBorrowedDate());
            }
        }
    }

    public void listBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (BorrowedBook borrowedBook : borrowedBooks) {
            System.out.printf("ID: %s | Title: %s | Borrower: %s | Date: %s%n",
                    borrowedBook.getId(), borrowedBook.getTitle(),
                    borrowedBook.getBorrowerName(), borrowedBook.getBorrowedDate());
        }
    }
}
