package Basic;

public class SumofDigit {
    public static void main(String[] args) {
        int num = 54321; // Example number
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit; // Add the digit to sum
            num /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits is: " + sum);
    }
}
