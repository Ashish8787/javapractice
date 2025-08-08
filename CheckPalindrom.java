public class CheckPalindrom {

    public static void main (String[] args) {
        String str = "madam";
        String rev ="";
        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);
        // StringBuffer rev = new StringBuffer(str);
        // rev.reverse();
        if (str.equals(rev)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}