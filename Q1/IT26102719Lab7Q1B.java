import java.util.Scanner;

public class IT26102719Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop to process marks for 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.print("Student " + i + " (Enter marks): ");
            
            double mark1 = scanner.nextDouble();
            double mark2 = scanner.nextDouble();
            double mark3 = scanner.nextDouble();
            double mark4 = scanner.nextDouble();
            
            // Calculate the average marks
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            
            // Determine the overall grade
            String grade;
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            
            // Display the results for the current student
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
        }
        
        scanner.close();
    }
}