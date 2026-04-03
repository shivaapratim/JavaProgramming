import java.util.*;

class WavePrint {
    public static List<Integer> wave(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length, m = mat[0].length;

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++)
                    ans.add(mat[i][j]);
            } else {
                for (int i = n - 1; i >= 0; i--)
                    ans.add(mat[i][j]);
            }
        }
        return ans;
    }
}