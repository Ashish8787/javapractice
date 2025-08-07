public class ReverseString {

    public static boolean dublicate(int[] arr){
        for(int i = 0 ;i<arr.length-1; i++){
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
public static void revers(String str){
    for(int i = str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
}

public static void main(String[] args) {
   revers("Ashish");
  int arr[] = {1,2,3,2};
    System.out.println(dublicate(arr));
}
}
