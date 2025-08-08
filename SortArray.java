import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // System.out.println("Original Array:");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        // // Bubble Sort (Ascending Order)
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             // Swap arr[j] and arr[j+1]
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        // System.out.println("\nSorted Array:");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
    }
}
