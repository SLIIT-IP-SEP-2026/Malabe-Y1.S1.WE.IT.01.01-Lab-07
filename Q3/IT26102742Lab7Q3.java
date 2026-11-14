import java.util.Scanner;
public class IT26102742Lab7Q3{
	public static void main(String[] args){
        double tot;
		double discount;
		double discountPerc=0.05;
		char mode;
		char modeCap;
		int custCount=1;
		Scanner input = new Scanner(System.in);
		while(custCount<=5){
			System.out.println("Customer "+custCount);
			System.out.print("Enter total bill amount: ");
			tot= input.nextDouble();
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			mode = input.next().charAt(0);
			modeCap = Character.toUpperCase(mode);
			if (modeCap=='C'){
				discount = tot*discountPerc;
				tot = tot- discount;
				System.out.println("Discount is: "+discount);
				System.out.println("Amount to be paid is: "+tot);
			}
			else if (modeCap=='O'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid is: "+tot);
			}
			else{
				System.out.println("Payment Mode is Not Valid");
			}
			System.out.println("\n");
			custCount+=1;
		}
	}
}