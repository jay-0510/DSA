package Basic;

//Paliindrome check
public class Palindromes {
    public static void main(String[] args) {
        int num = 121; // Example number
        int originalNum = num, reversedNum = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}