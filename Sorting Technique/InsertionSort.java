public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element, as the first element is already sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Compare key with each element in the sorted portion and shift larger elements
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift the larger element to the right
                j--; // Move one position back
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}