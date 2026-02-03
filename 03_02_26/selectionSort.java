public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 89, 24, 1, 0, 70 };

        for (int i = 0; i < arr.length - 1; i++) {
            int less = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[less]) {
                    less = j;
                }
            }
            int t = arr[less];
            arr[less] = arr[i];
            arr[i] = t;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
