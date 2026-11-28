import java.util.Scanner;

public class IT26102569Lab7Q3 
{
	public static void main(String[] args)
	{
    
    Scanner input = new Scanner(System.in);
	
	for (int i = 1; i <= 5; i++) {
	
	System.out.println("Customer " + i);
	
	System.out.print("Enter Total Bill amount: ");
	double bill = input.nextDouble();
	
	System.out.print("Enter the mode of payment (C for cash, O for other): ");
	char mode = input.next().charAt(0);
	
	if (mode == 'C' || mode == 'c'){
		
		double discount = bill * 5/100;
		double amount = bill - discount;
		
	    System.out.println("Discount is:" + discount);
		System.out.println("Amount to be paid: " + amount);
		
	}
	
	else if (mode == 'O' || mode == 'o'){
		
		System.out.println("NO DISCOUNT APPLICABLE");
		System.out.println("Amount to be paid: " + bill);

	}

    else {
     	System.out.println("Payment mode is not valid");
	}
	
	System.out.println();
	
	}
	
	input.close();
	
	}
	
}