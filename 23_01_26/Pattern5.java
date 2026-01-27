
public class Pattern5 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j)
                // Equation of lines, diagonal is just i+j=n-1, and at each step your i will
                // increase which will result in i + j > n , so anything below than that is a
                // shaded region.

                // Now if you write anything which has to cover the upper region it will mean
                // that my i will decrease so eventually this equation will also decrease, then,
                // i + j < n - 1 .

                // Similar to pattern 3 , but look how efficient and easy this is.

                // We dont have to think about the loops, we only have to think in a way to
                // figure out the logic for lines.
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
