package Basic;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 12345; // Example number to reverse
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            num /= 10; // Remove the last digit
        }

        System.out.println("Reversed number is: " + reversed);
    }
}
