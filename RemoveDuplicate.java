import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 4, 12, 36, 4, 1, 3, 9 };
        // this is only work on sorted array
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i] == arr[i + 1]) {
        //         for (int j = i + 1; j < n - 1; j++) {
        //             arr[j] = arr[j + 1];
        //         }
        //         n--;
        //         i--;
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println("Array without duplicates: " + set);
        // Convert HashSet back to array if needed
        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Unique Array: ");   
        for(int num : uniqueArray) {
            System.out.print(num + " ");    
            }
        System.out.println(); // For better readability
        System.out.println("Size of unique array: " + uniqueArray.length);
    }
}