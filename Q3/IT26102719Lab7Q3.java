import java.util.Scanner;

public class IT26102719Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop to process bills for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            // Enter total bill amount
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();
            
            // Enter mode of payment
            System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            char paymentMode = scanner.next().charAt(0);
            
            // Check payment mode validity and calculate discount
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;
                
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } 
            else if (paymentMode == 'O' || paymentMode == 'o') {
                double discount = 0.0;
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            } 
            else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
        
        scanner.close();
    }
}