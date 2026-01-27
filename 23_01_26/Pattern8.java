
public class Pattern8 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 || i == 0 || j == 0 || j == n - 1) // 4 lines 4 equations
                {

                    System.out.print(" * ");

                } else {

                    System.out.print("   ");

                }
            }
            System.out.println("");
        }

    }
}
