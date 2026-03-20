import java.util.*;

public class LCM {

    static int gcd(int a, int b) {
        int gd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gd = i;
        }
        return gd;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print((a / gcd(a, b)) * b);

        sc.close();
    }
}
