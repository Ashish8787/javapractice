import java.util.Scanner;

public class CountDublicate {

    // public static int dublicatArray(int array[], int targetValue){
    //     int count = 0;
    //     for(int i =0;i<array.length; i++){
    //         if(targetValue == array[i]){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    public static boolean dublicatArray(int []arr){
        for (int i = 0; i<arr.length -1; i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter size of array ");
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // System.out.println("Enter element one by one");
        // for(int i= 0;i < size; i++){
        //      arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the value for count");
        // int targetValue = sc.nextInt();
        // System.out.println("----------------Result---------------------------");
        // int res =dublicatArray(arr , targetValue);
        // System.out.println("total count is "+ res);

        int [] arr={1,2,5,9,6,4,3};
        System.out.println(dublicatArray(arr));
    }


}
