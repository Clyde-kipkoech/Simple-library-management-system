// interface of Library Operations
interface LibraryOperations {
    void addBook(int bookID, String title, String author);
    void addStudent(int studentID, String name);
    void checkoutBook(int studentID, int bookID);
    void returnBook(int studentID, int bookID);
    void displayAllBooks();
    void displayAllStudents();
}