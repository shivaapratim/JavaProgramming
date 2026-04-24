public class BinaryToDec {
    public static void main(String[] args) {
        int n = 10010;

        int base = 1;
        int ans = 0;

        while (n > 0) {
            int b = n % 10;
            ans += b * base;

            base *= 2;
            n /= 10;
        }

        System.out.println(ans);
    }
}