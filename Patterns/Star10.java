package Patterns;

// BINARY NUMBER TRIANGLE PATTERN --- 
public class Star10 {
    static void pattern10(int N) {

        // First row starts by printing a single 1.
        int start = 1;

        // Outer loop for the no. of rows
        for (int i = 0; i < N; i++) {

            // if the row index is even then 1 is printed first in that row.
            if (i % 2 == 0)
                start = 1;

            // if odd, then the first 0 will be printed in that row.
            else
                start = 0;

            // alternatively print 1's and 0's in each row by using the inner for loop.
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start; // here it will flip automatically....
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern10(N);
    }
}

// Concept : flipping of number - 0,1,0,1... 01, 101, 0101