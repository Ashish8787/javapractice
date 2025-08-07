import java.util.Scanner;

public class LargeElement {

    public static int findLargestElement(int array[]) {
        int largestElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
            System.out.println(array[i]);
        }
        return largestElement;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Vlaues of the array");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the "+ i + " index");
            arr[i] = sc.nextInt();
        }
        System.out.println("------------------------------All array element-----------------------------------------------");
        int largestValue = findLargestElement(arr);
        System.out.println("------------------------------Largest Value-----------------------------------------------");
        System.out.println("Largest Value is " + largestValue);
        sc.close();
    }
}
