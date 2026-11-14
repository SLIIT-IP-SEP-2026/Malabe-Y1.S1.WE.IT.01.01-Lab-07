public class IT26102719Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop for rows starting from 5 down to 1
        for (int i = 5; i >= 1; i--) {
            // Inner loop to print the number 'i' exactly 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}