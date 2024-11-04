package Patterns;

//  RIGHT ANGLED TRIANGLE PATTERN 
public class Star2 {
    static void pattern2 (int N){
        // This is the outer loop which will loop for the rows
        for (int i = 0; i < N; i++) {
            // This is the inner loop which will loop for the columns
            for (int j = 0; j <= i; j++) {
                System.out.print  ("*") ;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern2(N);
    }
}
