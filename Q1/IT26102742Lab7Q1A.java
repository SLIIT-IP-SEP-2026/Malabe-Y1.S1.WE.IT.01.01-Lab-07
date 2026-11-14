import java.util.Scanner;
public class IT26102742Lab7Q1A{
	public static void main(String[] args){
		double mark1;
		double mark2;
		double mark3;
		double mark4;
		double sum;
		double avg;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Subject Mark 1:");
		mark1 = input.nextDouble();
		System.out.print("Enter Subject Mark 2:");
		mark2 = input.nextDouble();
		System.out.print("Enter Subject Mark 3:");
		mark3 = input.nextDouble();
		System.out.print("Enter Subject Mark 4:");
		mark4 = input.nextDouble();
		sum = mark1+mark2+mark3+mark4;
		avg= sum/4;
		System.out.println("Average is : "+avg);
		if((avg<=100) && (avg>=75)){
			System.out.println("Overall Grade is : Distinction");
		}
		else if((avg<75) && avg>=50){
			System.out.println("Overall Grade is : Credit");
		}
		else{
			System.out.println("Overall Grade is : Fail");
		}
	}
}