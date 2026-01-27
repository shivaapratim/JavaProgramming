
public class Pattern9 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) // matrix size detection
            {
                if (i <= j && i + j <= 2 * n - 2) {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");

                }
            }
            System.out.println("");
        }

    }
}
