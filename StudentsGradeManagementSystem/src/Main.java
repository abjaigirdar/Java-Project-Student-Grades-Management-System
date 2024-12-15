import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String[]> students = new ArrayList<>();
//    static ArrayList<int[]> grade = new ArrayList<>();
    static ArrayList<Integer> grades = new ArrayList<>();




    public static void main(String[] args) {
        boolean continueRunning = true;
        Scanner console = new Scanner(System.in);

        while (continueRunning) {
            displayMenu();
            String choice = console.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    displayStudents();
                    break;
                case "3":
                    calculateAverageGrade();
                    break;
                case "4":
                    findTheHighestAndLowestGrade();
                    break;
                case "Q":
                case "q":
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. PLease try again.");
            }
        }
        System.out.println("Exiting the program. Goodbye!");
    }

    public static void displayMenu(){

        System.out.println("     +--------------------------------------------+");
        System.out.println("     |        What do you want to do next?        |");
        System.out.println("     +--------------------------------------------+");
        System.out.println("     | 1. Add students and their grades.          |");
        System.out.println("     | 2. Display all students and their grades.  |");
        System.out.println("     | 3. Calculate the average grade.            |");
        System.out.println("     | 4. Find the highest and lowest grade.      |");
        System.out.println("     |--------------------------------------------|");
        System.out.println("     |             Press 'Q' to exit!             |");
        System.out.println("     +--------------------------------------------+");
        System.out.print("Enter your choice: ");
    }

    public static void addStudent() {
        String firstName, lastName;
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Enter student's first name: ");
            firstName = console.nextLine();
            if (firstName.matches(".*\\d.*")) {
                System.out.println("Invalid input. Names cannot contain numbers.\n" +
                        "Please enter a valid first name:");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Enter student's last name: ");
            lastName = console.nextLine();
            if (lastName.matches(".*\\d.*")) {
                System.out.println("Invalid input. Names cannot contain numbers.\n" +
                        "Please enter a valid last name:");
            } else {
                break;
            }
        }
        // store grade
        while (true) {
            System.out.print("Enter " + firstName + " " + lastName + "'s grade: ");
            if (console.hasNextInt()) {
                int studentGrade = console.nextInt();
                console.nextLine();
                // store first and last name in an array
                String[] fullName = {firstName, lastName};
                // add the array to the arraylist
                students.add(fullName);
                // add grade to the arrayList
                grades.add(studentGrade);
                break;
            } else {
                System.out.println("Invalid input. Please enter numbers for the grade.");
                console.nextLine();
            }
        }
    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println(
                        "+------------------------------------------------------------------+\n" +
                        "|                      List of Students                            |\n" +
                        "+------------------------------------------------------------------+\n" +
                        "| No. |    First Name       |    Last Name            |   Grade    |\n" +
                        "+-----+---------------------+-------------------------+------------+");

        for (int i = 0; i < students.size(); i++) {
            String[] student = students.get(i);
            System.out.printf("| %-3d | %-10s          | %-10s              | %-6d     |\n",
                    (i + 1), student[0], student[1], grades.get(i));
        }
        System.out.println("+-----+---------------------+-------------------------+------------+");
    }

    public static void calculateAverageGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades available to calculate average.");
            return;
        }

        // getting the total of all grades
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        // getting the average grade
        double average = (double) sum / grades.size();
        System.out.println("Average grade: " + average);
    }

    public static void findTheHighestAndLowestGrade() {
        if (grades.isEmpty()) {
            System.out.println("No grades available to find highest and lowest.");
            return;
        }
        // getting the first grade and setting for highest and
        // lowest so that we can compare it with the next index
        int highest = grades.get(0);
        int lowest = grades.get(0);

        String[] studentWithHighestGrade = students.get(0);
        String[] studentWithLowestGrade = students.get(0);

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
                studentWithHighestGrade = students.get(i);
            }
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
                studentWithLowestGrade = students.get(i);
            }
        }
        System.out.println(studentWithHighestGrade[0] + " " + studentWithHighestGrade[1] +
                "got the highest grade of " + highest);
        System.out.println(studentWithLowestGrade[0] + " " + studentWithLowestGrade[1] +
                "got the lowest grade of " + lowest);
    }
}




