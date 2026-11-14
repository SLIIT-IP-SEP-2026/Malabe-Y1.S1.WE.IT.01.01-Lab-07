public class IT26102719Lab7Q2A {
    public static void main(String[] args) {
        // Outer loop for the 4 rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for the 5 columns in each row
            for (int j = 1; j <= 5; j++) {
                System.out.print("$ ");
            }
            // Move to the next line after printing 5 dollar signs
            System.out.println();
        }
    }
}