// Scanner Object
import java.util.Scanner;
public class IT26102398Lab7Q1B {
    public static void main(String[] args) {
        // Subjects marks Array
        int subjects[] = new int[4];
        // Average
        double average = 0.0;
        // Scanner
        Scanner input = new Scanner(System.in);
        // Enter Marks
        for(int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            for(int j = 0; j < 4; j++){
                subjects[j] = input.nextInt();
                if(subjects[j] > 101 & subjects[j] < -1){
                    break;
                }
                else{
                    average += (subjects[j] * 1.0);
                }
            }
        // average
        average = average / 4;
        // Grade: Distinction
        System.out.println("Average is : " + average);
        if(average <= 100.0 && average >= 75.0){
            System.out.println("Overall Grade is : Distinction\n");
            average = 0.0;
        }
        // Grade: Distinction
        else if(average <= 74.0 && average >= 50.0){
            System.out.println("Overall Grade is : Credit\n");
            average = 0.0;
        }
        // Grade: Distinction
        else if(average <= 49.0 && average >= 0.0){
            System.out.println("Overall Grade is : Fail\n");
            average = 0.0;
        }
        // return function
        else{
            average = 0.0;
            return;
        }
        }
    }
}