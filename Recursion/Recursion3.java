package Recursion;

public class Recursion3 {
    public static void printNumberReverse(int N) {
        // Base condition: if N is less than 1, stop recursion
        if (N < 1) {
            return;
        }
        // print the current number
        System.out.println(N + "");

        // recursive call with the lower number
        printNumberReverse(N - 1);
    }

    public static void main(String[] args) {
        int N = 7; //
        printNumberReverse(N); // start printing from N down to 1
    }
}
