import java.util.Scanner;
public class IT26102712Lab7Q3{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		for (int i=1; i<=4; i++){
			System.out.println("Customer "+i);
			System.out.print("Enter total bill amount: ");
			double totbill=input.nextDouble();
			System.out.print("Enter mode of paymeny (C for cash, O for other): ");
			char modePay=input.next().charAt(0);
				if (modePay!='o'&&modePay!='O'&&modePay!='c'&&modePay!='C'){
					System.out.println("Payment Mode is Not Valid");
				}else if(modePay=='c'||modePay=='C'){
					double discount=totbill*5/100;
					double finalBill=totbill-discount;
					System.out.println("Discount is: "+discount);
					System.out.println("Amount to be paid: "+finalBill);
				}else{
					System.out.println("Discount not applicable");
					System.out.println("Amount to be paid: "+totbill);
				}
			System.out.print("\n");
		}
	}
}