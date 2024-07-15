// to take Input from the student and related Information
import java.util.Scanner;
public class student {
    // Class member variables
    String studentName;
    String regNum;
    book borrowedBooks[] = new book[3];
    public int booksCount = 0;

    // Creating object of Scanner class to
    // take input from user
    Scanner input = new Scanner(System.in);
    // Constructor
    public student()
    {
        // Print statement
        System.out.println("Enter Student Name:");
        // These keywords refer to current instance
        this.studentName = input.nextLine();
        // Print statement
        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}
