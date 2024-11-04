package Basic;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Example number
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply factorial by i each time
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }

}
