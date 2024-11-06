package Recursion; // Add the semicolon here

class Basecondition {
    static int cnt = 0;

    static void print() {

        // Base Condition.
        if (cnt == 3)
            return;
        System.out.println(cnt);

        // Count incremented.
        cnt = cnt + 1;
        print();

    }

    public static void main(String[] args) {
        print();
    }
}

//It is the condition that is written in a recursive function in order for it to get completed and not to run infinitely. 
// Encounter it in base condition.