public class Armstrong {
    public static void main(String[] args) {
        int num = 154;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong");

        } else {
            System.out.println("Not Armstrong");
        }
    }
}
