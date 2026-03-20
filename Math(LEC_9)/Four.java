import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int power = 1;
        while (n > 0) {
            sum += (n % 10) * power;
            power *= 2;
            n /= 10;
        }
        System.out.print(sum);
        sc.close();
    }
}
