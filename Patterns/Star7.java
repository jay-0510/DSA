package Patterns;

// STAR PYRAMID
public class Star7 {
    static void pattern7(int N) {
        for (int i = 0; i < N; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row....1,3,5,7,9,11
            // Formula : 2 * i + 1 STARS...
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern7(N);
    }
}

// Concept : Space, Star, Space