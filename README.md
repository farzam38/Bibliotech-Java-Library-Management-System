# Library Management System

This project implements a simple Library Management System in Java, allowing users to manage books and student records, perform operations such as adding books, searching books by various criteria, managing student registrations, and handling book check-in and check-out.

## Features

- **Books Management**:
  - Add new books to the library.
  - Upgrade the quantity of existing books.
  - Search books by serial number and author name.
  - Display all books currently available in the library.

- **Student Management**:
  - Register new students.
  - Display all registered students.
  - Manage books borrowed by students (check out and check in).

## Installation

1. Clone the repository:

   ```
   git clone https://github.com/farzam38/library-management.git
   ```

2. Compile the Java files:

   ```
   javac *.java
   ```

3. Run the application:

   ```
   java Library
   ```

## Usage

Upon running the application (`Library.java`), you will be presented with a menu-driven interface. Here are the available operations:

- **Books Operations**:
  - Press `1` to Add a new Book.
  - Press `2` to Upgrade Quantity of a Book.
  - Press `3` to Search a Book (by Serial Number or Author Name).
  - Press `4` to Show All Books.

- **Student Operations**:
  - Press `5` to Register a Student.
  - Press `6` to Show All Registered Students.
  - Press `7` to Check Out a Book for a Student.
  - Press `8` to Check In a Book from a Student.

- Press `0` to Exit the application.

## File Structure

The project consists of the following Java files:
- `book.java`: Defines the `book` class for book details.
- `books.java`: Implements operations related to books (adding, searching, checking in/out).
- `student.java`: Defines the `student` class for student details and borrowed books.
- `students.java`: Implements operations related to students (registering, managing borrowed books).
- `Library.java`: Main class containing the `main` method for running the application and displaying the menu.
