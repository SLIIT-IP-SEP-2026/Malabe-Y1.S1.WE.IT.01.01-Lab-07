import java.util.Scanner;
public class IT26102742Lab7Q1B{
	public static void main(String[] args){
double mark1;
		double mark2;
		double mark3;
		double mark4;
		double sum;
		double avg;
		int studentCount=1;
		while(studentCount<=3){
		 System.out.println("Student "+studentCount);
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter Marks:");
		 mark1 = input.nextDouble();
		 mark2 = input.nextDouble();
		 mark3 = input.nextDouble();
		 mark4 = input.nextDouble();
		 sum = mark1+mark2+mark3+mark4;
		 avg= sum/4;
		 System.out.println("Average is : "+avg);
		 if((avg<=100) && (avg>=75)){
			System.out.println("Overall Grade is : Distinction\n");
		 }
		 else if((avg<75) && avg>=50){
			System.out.println("Overall Grade is : Credit\n");
		 }
		 else{
			System.out.println("Overall Grade is : Fail\n");
		 }
		 studentCount+=1;
		}
	}
}