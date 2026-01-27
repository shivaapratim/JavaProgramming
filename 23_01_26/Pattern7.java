
public class Pattern7 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n - 2; j++) {
                if (i + j >= n - 1 && i >= j - n + 1) {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");

                }
            }
            System.out.println("");
        }

    }
}
