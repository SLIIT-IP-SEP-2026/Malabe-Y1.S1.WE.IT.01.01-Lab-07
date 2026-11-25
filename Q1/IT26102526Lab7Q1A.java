import java.util.Scanner;

public class IT26102526Lab7Q1A {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for subjects: ");

        int sum = 0;
        int count = 1;
        String grade = "";
        double avg;

        while ( count <= 4) {
            System.out.print("Enter Subject Mark " + count + ": ");
             double marks = input.nextDouble();
             sum += marks;
            count++;
        }
        
        avg = sum /4.0;

        if(avg <= 100 && avg >= 75) {
            grade = "Distinction";
        } else if (avg <= 74 && avg >= 50){
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        
        System.out.println("Average is : " + avg );
        System.out.println("Overall Grade is : " + grade);

        
        input.close();

    }
}