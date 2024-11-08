package Recursion;

// Fibonacci using recursion
public class Recursion5 {
    // Recursive method to calculate the nth Fibonacci number
    public static int fib(int n) {
        // Base cases: if n is 0 or 1, return n
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive call: fib(n - 1) + fib(n - 2)
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int N = 5; // Change this to calculate a different Fibonacci number
        System.out.println("Fibonacci number at position " + N + " is: " + fib(N));
    }
}