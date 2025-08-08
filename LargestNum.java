public class LargestNum {

    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = arr[0];
        for(int num : arr) {
            if(num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest number in the array: " + largest);
    }
}