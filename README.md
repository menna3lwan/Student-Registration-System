# Student Registration System 🧑🏻‍💻

A simple program for managing student registrations.

## Purpose

The **Student Registration System** allows users to create, manage, and display student data efficiently. It provides the following features:

1. **Creating Student Data**:
   - Objects of type `Student` are created to represent students.
   - Key information such as name, department, college, student ID, age, and cumulative GPA is collected.

2. **Managing Student Data**:
   - Student data is stored in an `infoList`, which is an `ArrayList<Student>`.
   - Separate lists (`Namelist` and `IDList`) store student names and university IDs for search and display purposes.

3. **Displaying and Managing Data**:
   - The program offers the following options:
     - Display student information
     - Add a new student
     - View the name list
     - Search by student ID
     - Delete a student
   - User interactions are facilitated using the `JOptionPane` user interface.

4. **Main Repetition Loop**:
   - The program runs within a `do-while` loop until the user decides to exit.

## Classes Used

- `JOptionPane`: For user interaction
- `ArrayList`: For flexible data management

## Classes Created

- `public Student`: Represents student objects

## How to Use

1. Clone this repository to your local machine.
2. Compile and run the `StudentRegistrationSystem.java` file.
3. Follow the prompts to interact with the system.
