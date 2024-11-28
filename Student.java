import java.util.ArrayList;
import java.util.List;
class Student {
    int studentID;
    String name;
    List<Book> borrowedBooks;

    
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", Borrowed Books: ");
        for (Book book : borrowedBooks) {
            System.out.println("  - " + book.title);
        }
    }
}
