import java.util.Scanner;
//Main class
public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);


        // Adding 
        library.addBook(1, "The Pearl", "John Steinback");
        library.addBook(2, "1984", "John Steinback");
        library.addStudent(001, "Clyde");
        library.addStudent(002, "Kipkoech");

        
        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Checkout Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(bookID, title, author);
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int studentID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    library.addStudent(studentID, name);
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int studentIDCheckout = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bookIDCheckout = scanner.nextInt();
                    library.checkoutBook(studentIDCheckout, bookIDCheckout);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int studentIDReturn = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bookIDReturn = scanner.nextInt();
                    library.returnBook(studentIDReturn, bookIDReturn);
                    break;

                case 5:
                    library.displayAllBooks();
                    break;

                case 6:
                    library.displayAllStudents();
                    break;

                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}












