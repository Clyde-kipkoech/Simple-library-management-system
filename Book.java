// Book class
class Book {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    
    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    // book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}
