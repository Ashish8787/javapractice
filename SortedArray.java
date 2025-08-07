import java.util.Scanner;

public class SortedArray {

    public static boolean isSortedArray(int array[]){
        boolean isSorted = true;
        for(int i =0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted = false;
            }
        }
        return isSorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the the value one by one");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean res = isSortedArray(arr);
        System.out.println("Is Shorted " +res);
    }
}
