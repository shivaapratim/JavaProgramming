class NumberPattern3 {
    public static void main(String[] args) {

        int n = 12;
        int sum = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                if (i + j >= n - 1 && i >= j - n + 1) {
                    System.out.printf("%4d", sum);
                    sum++;

                } else {
                    System.out.print("    ");
                }
            }

            System.out.println();

        }
    }
}
