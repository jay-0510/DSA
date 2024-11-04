package Basic;

public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 15; // Example numbers
        int gcd = findGCD(a, b); // Calculate GCD first
        int lcm = (a * b) / gcd; // Calculate LCM using formula

        System.out.println("LCM is: " + lcm);
    }

    // Helper method to calculate GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Formula: a x b / GCD (a,b)