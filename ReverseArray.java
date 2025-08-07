import java.util.Scanner;

public class ReverseArray {

    public static void ReversedArray(int array[]) {
        // int temp[] = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            // temp[array.length - i - 1] = array[i];
            System.out.println(array[i]);
        }
        // return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Value of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(
                "------------------------------All Reverse array element-----------------------------------------------");
        // int rev[] = ReversedArray(arr);
        // for (int value : rev) {
        // System.out.println(value);
        // }
        ReversedArray(arr);
        // for (int values : arr) {
        //     System.out.println(values);
        // }
    }

}
