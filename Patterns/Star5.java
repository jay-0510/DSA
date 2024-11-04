package Patterns;

//  INVERTED RIGHT PYRAMID --
public class Star5 {
    static void pattern5(int N) {
        // This is the outer loop which will loop for the rows.
        for (int i = 0; i < N; i++) {
            // This is the inner loop which loops for the columns
            // no. of columns = (N - row index) for each line here.
            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern5(N);
    }
}