
public class Rev {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        int temp = n;

        // while loop prior( to check digit count)

        while (n > 0) {
            int val = (n % 10);
            sum += val * val * val;
            n /= 10;
        }
        System.out.print(sum == temp ? "Number is armstrong" : "Number is not armstrong");
    }
}
