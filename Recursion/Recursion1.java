package Recursion;

// PRINT NAME N TIMES 
public class Recursion1 {
    static void func(int i, int n) {

        // Base Condition.
        if (i > n)
            return;
        System.out.println("Cristiano");

        // Function call to print till i increments.
        func(i + 1, n);

    }

    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        int n = 4;
        func(1, n);
    }
}

// Time Complexity - O(N) - calling N functions