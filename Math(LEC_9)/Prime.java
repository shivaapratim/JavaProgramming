public class Prime {

    public static int isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int a = 13;

        System.out.print(isPrime(a) == 1
                ? "Number is prime"
                : "Number is not prime");
    }
}
