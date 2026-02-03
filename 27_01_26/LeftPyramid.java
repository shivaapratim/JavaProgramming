
public class LeftPyramid {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i <= 2 * n - 2; i++) {
            for (int j = 0; j < n; j++) {
                if ((i >= n - 1 && i <= j + n - 1) || (i <= n - 1 && i + j >= n - 1)) {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");

                }
            }
            System.out.println("");
        }

    }
}