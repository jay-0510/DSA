package Patterns;

// RIGHT ANGLED NUMBER PYRAMID : 
public class Star3 {
    static void pattern3 (int N){
        // This is the outer loop which will loop for the rows
        for (int i = 0; i <= N; i++) {

            // This is the inner loop which will loop for the columns
            // no. of rows = no. of columns
            // Print numbers from 1 to the row 
            // instead of stars in each row. 
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ") ;
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern3(N);
    }
}
