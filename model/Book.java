package model;

public class Book {
    private String id;
    private String title;
    private String author;
    private String location;

    public Book(String id, String title, String author, String location) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.location = location;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLocation() {
        return location;
    }

    // Method to check availability
    public boolean isAvailable() {
        return true; // Buku default tersedia kecuali menjadi BorrowedBook
    }
}
