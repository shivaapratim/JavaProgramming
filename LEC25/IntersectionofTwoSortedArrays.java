package LEC25;

import java.util.*;

public class IntersectionofTwoSortedArrays {

    public static List<Integer> intersect(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                i++;
            else if (a[i] > b[j])
                j++;
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4 };
        int[] b = { 2, 2, 4, 6 };

        System.out.println(intersect(a, b));
    }
}
