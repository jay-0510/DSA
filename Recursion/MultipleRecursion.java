package Recursion;

// 	Base Cases: If  N = 0  or  N = 1 , the function returns  N .
// 	Recursive Case: If  N  is greater than 1, the function calls itself

public class MultipleRecursion {
    public static int fib(int N) {
        // Base cases: if N is 0 or 1, return N
        if (N == 0 || N == 1) {
            return N;
        }
        // Recursive calls to calculate fib(N-1) and fib(N-2)
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        int N = 5; // Change this to calculate a different Fibonacci number
        System.out.println("Fibonacci number at position " + N + " is: " + fib(N));
    }
}
