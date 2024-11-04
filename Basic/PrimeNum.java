package Basic;

// Check if a Number is prime
public class PrimeNum {
    public static void main(String[] args) {
        int n = 29; // Example number
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            // Check divisibility up to sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // Divisible by i means not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

}
