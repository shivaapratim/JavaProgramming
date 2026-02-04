public class insertionSort {
    public static void main(String[] args) {

        int[] arr = { 24, 20, 40, 23 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int p = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > p) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = p;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
