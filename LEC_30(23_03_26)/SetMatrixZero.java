import java.util.*;

class SetMatrixZero {
    public static void setZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i : rows) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = 0;
            }
        }

        for (int j : cols) {
            for (int i = 0; i < n; i++) {
                mat[i][j] = 0;
            }
        }
    }
}