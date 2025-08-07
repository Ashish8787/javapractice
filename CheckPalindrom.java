public class CheckPalindrom {

    public static void main (String[] args) {
        String str = "Ashish";
        StringBuffer rev = new StringBuffer(str);
        rev.reverse();
        if (str.equals(rev.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}