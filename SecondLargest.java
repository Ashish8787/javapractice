import java.util.Scanner;

public class SecondLargest {

    public static int secondLarge(int array[]) {
        int largest = array[0];
        int secondLarge = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLarge = largest;
                largest = array[i];
            } else if ((array[i] > secondLarge) && (array[i] != largest)) {
                secondLarge = array[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter value of array one by one");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("----------------------------------------------------------------------------------------");
       int res = secondLarge(arr);
       System.out.println("Second Largest Number is : "+res);
    }
}
