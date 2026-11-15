import java.util.Scanner;
public class IT26102712Lab7Q1A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int mark1,mark2,mark3,mark4;
		double average;
	System.out.print("Enter Subject Mark 1: ");
	mark1=input.nextInt();
	System.out.print("Enter Subject Mark 2: ");
	mark2=input.nextInt();
	System.out.print("Enter Subject Mark 3: ");
	mark3=input.nextInt();
	System.out.print("Enter Subject Mark 4: ");
	mark4=input.nextInt();
	System.out.println();
	average=(mark1+mark2+mark3+mark4)/4;
	System.out.println("Average is : "+average);
	if (average>=75 && average<=100){
		System.out.print("Overall Grade is : Distinction");
	}else if (average>=50 && average<=74){
		System.out.print("Overall Grade is : Credit");
	}else if (average>=0 && average<=49){
		System.out.print("Overall Grade is : Fail");
	}
	}
}