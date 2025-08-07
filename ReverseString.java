// public class ReverseString {
//     public static void main(String[] args) {
//         String str = "Hello, World!";
//         String rev = "";
//         for (int i = str.length()-1;i >= 0;i--){
//             rev += str.charAt(i);
//         }
//         System.out.println("Reversed String: " + rev);
//     }
// }
//output: Reversed String: !dlroW ,olleH
//with help of function
public class ReverseString {
    public static void main(String[] args) {
        String str = "Ashish";
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        System.out.println("Reversed String: " + rev);
    }
}