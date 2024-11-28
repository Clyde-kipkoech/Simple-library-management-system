import java.util.HashMap;
// Library management implements Library Operations interface
class LibraryManagementSystem implements LibraryOperations {
    HashMap<Integer, Book> books = new HashMap<>();
    HashMap<Integer, Student> students = new HashMap<>();

    // Adding  new book
    public void addBook(int bookID, String title, String author) {
        books.put(bookID, new Book(bookID, title, author));
        System.out.println("Book added: " + title);
    }

    // Adding new student
    public void addStudent(int studentID, String name) {
        students.put(studentID, new Student(studentID, name));
        System.out.println("Student added: " + name);
    }

    // Check out a book
    
    public void checkoutBook(int studentID, int bookID) {
        if (students.containsKey(studentID) && books.containsKey(bookID)) {
            Book book = books.get(bookID);
            Student student = students.get(studentID);

            if (book.isAvailable) {
                student.borrowedBooks.add(book);
                book.isAvailable = false;
                System.out.println(student.name + " has borrowed \"" + book.title + "\".");
            } else {
                System.out.println("Book \"" + book.title + "\" is not available.");
            }
        } else {
            System.out.println("Invalid student ID or book ID.");
        }
    }

    // Return a book
    
    public void returnBook(int studentID, int bookID) {
        if (students.containsKey(studentID) && books.containsKey(bookID)) {
            Student student = students.get(studentID);
            Book book = books.get(bookID);

            if (student.borrowedBooks.contains(book)) {
                student.borrowedBooks.remove(book);
                book.isAvailable = true;
                System.out.println(student.name + " has returned \"" + book.title + "\".");
            } else {
                System.out.println("Book not found in the student's borrowed list.");
            }
        } else {
            System.out.println("Invalid student ID or book ID.");
        }
    }

    // Display all books
    
    public void displayAllBooks() {
        System.out.println("Books in the library:");
        for (Book book : books.values()) {
            book.displayBookDetails();
        }
    }

    // Display all students

    public void displayAllStudents() {
        System.out.println("Students in the library:");
        for (Student student : students.values()) {
            student.displayStudentDetails();
        }
    }
}
