package Recursion;

// additional parameters are used to accumulate or carry forward intermediate results,
// making the base case produce the final answer directly.
// Sum of First N Natural Numbers
public class parameterisedFun {
    public static void sum(int N, int accumulatedSum) {
        // Base case: if N is 0, print the accumulated sum
        if (N == 0) {
            System.out.println("Sum: " + accumulatedSum);
            return;
        }
        // Recursive call with N-1 and updated accumulatedSum
        sum(N - 1, accumulatedSum + N);
    }

    public static void main(String[] args) {
        int N = 5;
        sum(N, 0); // Start with accumulated sum as 0
    }
}