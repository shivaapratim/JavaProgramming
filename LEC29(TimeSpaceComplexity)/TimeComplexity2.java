public class TimeComplexity2 {
    public static void main(String args[]) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.println("Hello");
            }
        }

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 0; j < n; j++) {
                System.out.println("Hello");
            }
        }

        for (int i = n; i > 0; i /= 2) {
            for (int j = 0; j < i; j++) {
                System.out.println("Hello");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j *= 2) {
                System.out.println("Hello");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j *= 2) {
                System.out.println("Hello");
            }
        }

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.println("Hello");
            }
        }

        for (int i = n; i > 0; i /= 2) {
            for (int j = 0; j < n; j++) {
                System.out.println("Hello");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j += i) {
                System.out.println("Hello");
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                for (int j = 1; j <= n; j += i) {
                    System.out.println("Hello");
                }
            }
        }

        for (int i = 2; i <= n; i = i * i) {
            System.out.println("Hello");
        }

        int j = 0;

        for (int i = 0; i < n; i++) {

            while (j < n) {
                System.out.println("Hello");
                j++;
            }
        }

        int j = n - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0) {
                System.out.println("Hello");
                j--;
            }
        }

        int i = 0, j = n - 1;

        while (i < j) {
            System.out.println("Hello");
            i++;
            j--;
        }

        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && j < i + 5) {
                System.out.println("Hello");
                j++;
            }
        }

    }
}
