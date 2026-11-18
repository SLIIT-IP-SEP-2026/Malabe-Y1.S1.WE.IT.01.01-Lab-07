// Scanner Object
import java.util.Scanner;
public class IT26102398Lab7Q1A {
    public static void main(String[] args) {
        // Subjects marks
        int subjects;
        // Average
        double average = 0.0;
        // Scanner
        Scanner input = new Scanner(System.in);
        // Enter Marks
        for(int i = 1; i < 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            subjects = input.nextInt();
            if((subjects <= 100 && subjects >= 0)) {
                average += (subjects * 1.0);
            }
            else {
                break;
            }
        }
        // average
        average = average / 4;
        // Grade: Distinction
        System.out.println("\nAverage is : " + average);
        if(average <= 100.0 && average >= 75.0){
            System.out.print("Overall Grade is : Distinction");
        }
        // Grade: Distinction
        else if(average <= 74.0 && average >= 50.0){
            System.out.print("Overall Grade is : Credit");
        }
        // Grade: Distinction
        else if(average <= 49.0 && average >= 0.0){
            System.out.print("Overall Grade is : Fail");
        }
        // return function
        else{
            return;
        }
    }
}