import java.util.*;

public class BinaryOn2D {

    static boolean search(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int low = 0, high = n * m - 1;
        

        while (low <= high) {
            int mid = (low + high) / 2;

            int r = mid / m;
            int c = mid % m;

            if (arr[r][c] == target) {
                return true; // mark answer
            } else if (arr[r][c] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        System.out.println(search(arr, target));
    }
}