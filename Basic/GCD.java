package Basic;

public class GCD {
    public static void main(String[] args) {
        int a = 56, b = 98; // Example numbers
        while (b != 0) {
            int temp = b; // Temporarily hold b
            b = a % b; // Update b to remainder of a divided by b
            a = temp; // Update a to the previous value of b
        }
        System.out.println("GCD is: " + a); // When b is 0, a is the GCD
    }
}

// RULE : GCD(a, b) = GCD(b, a % b) until b becomes 0.