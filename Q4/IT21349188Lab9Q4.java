import java.util.Scanner;

public class IT21349188Lab9Q4 {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Create 1D String Array
        String[] names = new String[5];

        // Create 1D Double Arrays
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];

        // Create 1D Char Array
        char[] grades = new char[5];

        // Input for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = input.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = input.nextDouble();
            input.nextLine(); // Skip reading the newline character by Scanner

            // Calculate final mark and grade
            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]); // Call 'calcFinalMark' Method
            grades[i] = findGrades(finalMarks[i]); // Call 'findGrades' Method
        }
        System.out.println();
        
        // Close the scanner
        input.close();

        // Print the headers
        System.out.println("Name\t\tFinal Mark\tGrade");

        // Print details of each student
        for (int i = 0; i < 5; i++) {
            // Call 'printDetails' Method
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
    
    // Method to calculate the final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7); // 30% assignment, 70% exam
    }

    // Method to determine the grade based on the final mark
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Method to print the details of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t\t" + String.format("%.2f", finalMark) + "\t\t" + grade);
    }
}