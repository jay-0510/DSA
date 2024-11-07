package Recursion; // Add the semicolon here

class Basecondition {
    // Method to calculate factorial
    public static int factorial(int n) {
        // Base condition: if n is 0, return 1 (because 0! is 1)
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

// It is the condition that is written in a recursive function in order for it
// to get completed and not to run infinitely.
// Encounter it in base condition.