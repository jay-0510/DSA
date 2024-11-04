package Patterns;

//INVERTED STAR PYRAMID -- 
public class Star8 {
    static void pattern8(int N) {
        for (int i = 0; i < N; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row...... 11,9,7,5,3,1 .... REVERSE ORDER
            // Formula : 2*N - (2*i+1) stars
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern8(N);
    }
}

// Concept: Space, STAR, space
