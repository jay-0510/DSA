package Recursion;

//Reverse an Array using recursion 
public class Recursion4 {
    public static void reverseArray(int[] arr, int start, int end) {
        // Base condition: if start index is no longer less than end index, stop rec
        if (start >= end) {
            return;
        }
        // swap the elements start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // call the function recursively
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr, 0, arr.length - 1); // Start with the full array

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}