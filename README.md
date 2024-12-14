<h1> Java Projet: Student Grades Management System</h1>

### Project Overview
You will create a system to manage students' grades for a class. The system will:
1. Add students and their grades.
2. Calculate the average grade.
3. Find the highest and lowest grades.
4. Display all students and their grades.

### Student Grades Management System

#### Application Flow Diagram

```plaintext
                           +---------------------------+
                           |      Start Application    |
                           +---------------------------+
                                       |
                                       v
                           +---------------------------+
                           |        Display Menu       |
                           +---------------------------+
                                       |
                                       v
                           +---------------------------+
                           |      Get User Choice      |
                           +---------------------------+
                                       |
                                       v
                           +---------------------------+
                           |         Switch Case       |
                           |    Based on User Choice   |
                           +---------------------------+
                                       |
          +----------------------------+----------------------------+
          |                            |                            |
          v                            v                            v
   +---------+                +---------+                +---------+  
   | Add     |                | Calculate|                | Find    |  
   | Student |                | Average  |                | Highest |  
   | & Grade |                | Grade    |                | Grade   |  
   +---------+                +---------+                +---------+  
          |                            |                            |
          v                            v                            v
   +---------+                +---------+                +---------+ 
   | Find    |                | Display  |                | Find    | 
   | Lowest  |                | All      |                | Lowest  | 
   | Grade   |                | Students |                | Grade   | 
   +---------+                +---------+                +---------+  
                                       |
                                       v
                           +---------------------------+
                           |   Exiting Application     |
                           +---------------------------+
                                       |
                                       v
                           +---------------------------+
                           |       End Application     |
                           +---------------------------+
```

### Detailed Steps:

1. **Start Application**:
   - Initialize necessary variables and arrays (student names, grades, count).

2. **Display Menu**:
   - Show options to the user: Add Student, Calculate Average, Find Highest Grade, Find Lowest Grade, Display All Students, Exit.

3. **Get User Choice**:
   - Use `Scanner` to capture user input for menu selection.

4. **Switch Case Based on User Choice**:
   - Depending on the user input, perform the corresponding action:
     - **Add Student & Grade**: Allow the user to input student names and grades.
     - **Calculate Average Grade**: Calculate the average of the entered grades.
     - **Find Highest Grade**: Identify the highest grade among the entered grades.
     - **Find Lowest Grade**: Identify the lowest grade among the entered grades.
     - **Display All Students & Grades**: Display the list of all students and their respective grades.
     - **Exit**: Exit the application.

5. **Loop Back to Display Menu**:
   - After each action, the menu is displayed again, allowing the user to choose another action or exit.

6. **End Application**:
   - When the user selects exit, gracefully terminate the program.

### Instructions to Implement:
1. **Design the Menu System**: Create a simple menu system that loops until the user decides to exit.
2. **Implement Methods**: Create methods for each major functionality (e.g., adding students, calculating grades).
3. **Use Control Structures**: Utilize loops and switch-case for handling user input and performing actions.

### Additional Enhancements:
1. **Input Validation**: Ensure grades are between 0 and 100.
2. **Dynamic Array Size**: Allow dynamic resizing of arrays to add more students if needed.
3. **Sorting**: Add functionality to display students sorted by their grades.

### Code Review Checklist:
- **Readability**: Ensure the code is easy to read and understand.
- **Comments**: Include comments to explain complex sections.
- **Error Handling**: Handle potential errors gracefully.
- **User Input Validation**: Ensure user inputs are validated to prevent crashes.
