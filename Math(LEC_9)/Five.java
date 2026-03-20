import java.util.*;

public class Five {

    public static void printSeries(int n1, int n2) {
        int count = 0;
        int n = 1;

        while (count < n1) {
            int term = 3 * n + 2;
            if (term % n2 != 0) {
                System.out.println(term);
                count++;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        printSeries(n1, n2);
    }
}
