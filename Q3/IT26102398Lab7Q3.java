// Scanner Class
import java.util.Scanner;
public class IT26102398Lab7Q3{
    public static void main(String[] args){
        // Total bill amount
        int amount;
        // Discount
        final double DISCOUNT = 0.05;
        double sub_Amount;
        double total;
        char payment;
        // Scanner Object
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            // Customer
            System.out.println("Customer " + i);
            // Amount Input
            System.out.print("Enter total bill amount: ");
            amount = input.nextInt();
            // Discount calculation
            System.out.print("Enter mode of payment (C for cash, o for other): ");
            payment = input.next().toUpperCase().charAt(0);
            // Discount verification
            if (payment == 'C'){
                sub_Amount = amount * DISCOUNT;
                System.out.println("Discount is: " + sub_Amount);
                total = amount - sub_Amount;
                System.out.println("Amount to be paid " + total + "\n");
            }
            else if (payment == 'O'){
                sub_Amount = amount * DISCOUNT;
                System.out.println("No discount applicable");
                total = amount * 1.0;
                System.out.println("Amount to be paid " + total + "\n");
            }
            else{
                System.out.println("Payment mode is Not Valid\n");
            }
        }
    }
}