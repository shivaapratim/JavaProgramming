public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 5, 4, 9, 13, 15 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
