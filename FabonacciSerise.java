public class FabonacciSerise {
public static void main (String[] args){
    int n=10; // Length of the Fibonacci series
    int a= 0, b=1, c;
    for(int i = 2; i <= n; i++){
        c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
    }
    System.out.print("Fibonacci Series of " + n + " numbers: ");
}
}
