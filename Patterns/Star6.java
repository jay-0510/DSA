package Patterns;

//INVERTED NUMBERED RIGHT PYRAMID
public class Star6 {
    static void pattern6(int N) {
        for (int i = 0; i < N; i++) {
            // This is the inner loop which loops for the columns
            // no. of columns = (N - row index) for each line here
            // (N-j) will give us the numbers in a row starting from 1 to N-i.
            for (int j = N; j > i; j--) {
                System.out.print(N - j + 1 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern6(N);
    }

}
