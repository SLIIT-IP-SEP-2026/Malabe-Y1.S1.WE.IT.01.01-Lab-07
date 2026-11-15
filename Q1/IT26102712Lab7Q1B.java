import java.util.Scanner;
public class IT26102712Lab7Q1B{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("Student "+i);
			System.out.print("Enter marks: ");
			int mark1=input.nextInt();
			int mark2=input.nextInt();
			int mark3=input.nextInt();
			int mark4=input.nextInt();
			double average=(mark1+mark2+mark3+mark4)/4;
			System.out.println("Average is : "+average);
		if (average>=75 && average<=100){
		System.out.print("Overall Grade is : Distinction");
		}else if (average>=50 && average<=74){
		System.out.print("Overall Grade is : Credit");
		}else if (average>=0 && average<=49){
		System.out.print("Overall Grade is : Fail");
		}
		System.out.print("\n\n");
		}
	}
}