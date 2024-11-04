package Basic;

//PRINT DIVISOR OF NUMBER
public class Divisor {
    public static void main(String[] args) {
        int n = 36; // Example number
        System.out.println("Divisors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {

            // If i divides n with no remainder, it's a divisor
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
