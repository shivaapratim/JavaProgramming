
public class Swastika {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || // central horizontal
                        j == n / 2 || // central vertical
                        (i == 0 && j >= n / 2) || // top right horizontal
                        (i == n - 1 && j <= n / 2) || // bottom left horizontal
                        (j == 0 && i <= n / 2) || // left top vertical
                        (j == n - 1 && i >= n / 2) // right bottom vertical
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
