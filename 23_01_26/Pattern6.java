
public class Pattern6 {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) // Diagonal -> i == j + c // which can also we written as i==j because start is
                            // i=0 and j=0, and at each change with respect to diagonal it will be i=1 , j=1
                            // then in next iteration it will be i=2 then j=2.
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
