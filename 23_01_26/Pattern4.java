
public class Pattern4 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) // Equation of lines, diagonal is just i+j=n-1, and at each step your i will
                                    // increase which will result in i+j>n , so anything below than that is a shaded
                                    // region.
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
