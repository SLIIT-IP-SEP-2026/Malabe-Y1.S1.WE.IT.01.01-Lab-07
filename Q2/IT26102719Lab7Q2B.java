public class IT26102719Lab7Q2B {
    public static void main(String[] args) {
        // Outer loop for rows 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the current number and separator
            System.out.print(i + " - ");
            
            // Inner loop to print 'i' number of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}