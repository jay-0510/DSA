package Recursion;

// PRINT 1 TO N USING RECURSION
public class Recursion2 {
    public static void printNumbers(int current, int N) {
        // Base condition: if current is greater than N, stop recursion
        if (current > N) {
            return;
        }
        /// Print the current number
        System.out.println(current);

        // Recursive call with the next number
        printNumbers(current + 1, N);
    }

    public static void main(String[] args) {
        int N = 7; // Change this value to print up to a different number
        printNumbers(1, N); // Start printing from 1
    }
}
