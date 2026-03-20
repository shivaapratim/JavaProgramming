import java.util.*;

public class Conv {

    static int toDecimal(int sb, int n) {
        int dec = 0, power = 1;

        while (n > 0) {
            int digit = n % 10;
            dec += digit * power;
            power *= sb;
            n /= 10;
        }
        return dec;
    }

    static int fromDecimal(int db, int n) {
        int ans = 0, power = 1;

        while (n > 0) {
            int digit = n % db;
            ans += digit * power;
            power *= 10;
            n /= db;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();

        int decimal = toDecimal(sb, sn);
        int result = fromDecimal(db, decimal);

        System.out.println(result);
    }
}
