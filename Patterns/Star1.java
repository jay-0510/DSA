package Patterns;

// RECTANGULAR STAR PATTERN
public class Star1 {
    static void pattern1 (int N){
        // This is the outer loop which will loop for the rows
        for (int i = 0; i < N; i++) {
            // This is the inner loop which will loop for the columns
            for (int j = 0; j < N; j++) {
                System.out.print  ("*") ;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern1(N);
    }
}
