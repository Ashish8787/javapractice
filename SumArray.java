import java.util.Scanner;

public class SumArray {

    public static int SumArrays(int array[]){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
             sum = sum+array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Values of the array one by one");
        for(int i = 0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("------------------------------All array element Sum -----------------------------------------------");
        int sum =SumArrays(arr);
        System.out.println(sum);
    }
    
}
