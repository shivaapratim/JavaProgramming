import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int oddSum = 0, evenSum = 0;
        int pos = 1;

        while (n > 0) {
            int digit = (int) (n % 10);

            if (pos % 2 == 1)
                oddSum += digit;
            else
                evenSum += digit;

            n /= 10;
            pos++;
        }

        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
