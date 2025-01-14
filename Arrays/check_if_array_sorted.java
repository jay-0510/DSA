package arrays;

class check_if_array_sorted {
    static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 }, n = 5;

        System.out.println(isSorted(arr, n));
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Output: true
