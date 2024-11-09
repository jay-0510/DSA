package Recursion;

// we don’t use an extra parameter to accumulate results.
// recursive call calculates and returns a value that is added up through the recursive chain.
// Sum of First N Natural Numbers
public class FuncrtionalRecursion {
    public static int sum(int N) {
        // Base case: if N is 0, return 0
        if (N == 0) {
            return 0;
        }
        // Recursive call with N-1 and add current N to the result
        return N + sum(N - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Sum: " + sum(N));
    }
}
