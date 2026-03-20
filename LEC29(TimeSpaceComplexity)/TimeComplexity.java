
public class TimeComplexity {
    public static void main(String args[]) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("hello");
            }
        }

        for (int i = 1; i <= n; i *= 2) {
            System.out.println("hello");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.println("hello");
            }
        }

        for (int i = n; i >= 1; i /= 2) {
            for (int j = 0; j < i; j++) {
                System.out.println("hello");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j *= 2) {
                System.out.println("hello");
            }
        }

        for (int i = 1; i <= n; i *= 2) {
            for (int j = 1; j <= n; j++) {
                System.out.println("hello");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j += i) {
                System.out.println("hello");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j *= 2) {
                for (int k = 1; k <= j; k++) {
                    System.out.println("hello");
                }
            } // (2n) GP
        } // O(n) ==> n*2n ==> n square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j *= 2) {
                System.out.println("hello");
            }
        }

    }
}
