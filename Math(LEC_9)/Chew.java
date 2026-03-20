import java.util.*;

public class Chew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long result = 0;
        long place = 1;

        while (n > 0) {
            long d = n % 10; // 4
            long inv = 9 - d;

            // Avoid leading zero case
            if (n < 10 && inv == 0)
                inv = d;

            long digit = Math.min(d, inv); // 4

            result += digit * place;
            place *= 10;
            n /= 10;
        }

        System.out.println(result);
    }
}
