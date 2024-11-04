package Basic;

//Check Armstrong number---: 
public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 153; // Example number
        int originalNum = num;
        int result = 0;
        int digits = String.valueOf(num).length(); // Count the number of digits

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            result += Math.pow(digit, digits); // Raise digit to power of digits and add to result
            num /= 10; // Remove the last digit
        }

        // Check if result matches the original number
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
