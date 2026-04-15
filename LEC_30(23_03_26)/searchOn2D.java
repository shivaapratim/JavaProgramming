public class searchOn2D {

    public static int[] search(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 9, 10, 11 },
                { 15, 19, 21 }
        };

        int target = 15;

        int[] ans = search(arr, target);

        System.out.print(ans[0] + " " + ans[1]);
    }
}