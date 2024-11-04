package Patterns;

//RIGHT ANGLED NUMBER PYRAMID - 2
public class Star4 {
    static void pattern4(int N) {
        // This is the outer loop which will loop for the rows.
        for (int i = 1; i <= N; i++) {

            // no. of columns = row number for each line here.
            // Here, we print numbers equal to the row number ... instead of stars in each
            // row.

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern4(N);
    }
}
