import java.util.*;

public class Factory {

    static boolean check(long[] machines, long mid, long t) {
        long totalUnits = 0;

        for (int i = 0; i < machines.length; i++) {
            totalUnits += mid / machines[i];
            if (totalUnits >= t)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 3
        long t = sc.nextLong(); // 7

        long[] machines = new long[n];// the time ith machines take to produce 1 product
        for (int i = 0; i < n; i++)
            machines[i] = sc.nextLong(); // 2 3 5

        long low = 1, high = (long) 1e18, ans = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (check(machines, mid, t)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}