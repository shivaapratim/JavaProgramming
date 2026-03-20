import java.util.*;

public class Second {

    public static int countDigit(long n, int d) {
        if (n == 0 && d == 0)
            return 1;

        int count = 0;

        while (n > 0) {
            if (n % 10 == d)
                count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();

        System.out.println(countDigit(n, d));
    }
}
