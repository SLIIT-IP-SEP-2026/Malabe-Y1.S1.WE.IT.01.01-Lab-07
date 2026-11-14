import java.util.Scanner;

public class IT26100314Lab7Q1A {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter subject mark 1 :");
		double sub1 = input.nextDouble();
		
		System.out.print("Enter subject mark 2:");
		double sub2 =input.nextDouble();
		
		System.out.print("Enter subject mark 3:");
		double sub3= input.nextDouble();
		
		System.out.print("Enter subject mark 4:");
		double sub4= input.nextDouble();
		
		double average = (sub1 + sub2 + sub3 + sub4 )/4.0 ;
		
		String Grade;
		
		if (average>= 75) {
			 grade = "Distinction ";
		}else if (average>=50) {
			 grade = " Credit" ;
		}else {
			 grade = "Fail";
		}
		
		System.out.println("Average = " + average );
		System.out.println("Grade" + grade ) ;
		
		
		
	}
}