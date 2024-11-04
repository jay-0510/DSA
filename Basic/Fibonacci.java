package Basic;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms to display
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print current term
            int next = first + second; // Calculate next term
            first = second; // Shift first to second
            second = next; // Update second to next term
        }
    }
}
