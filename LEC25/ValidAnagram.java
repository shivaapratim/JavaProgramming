package LEC25;

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] != b[j])
                return false;
            i++;
            j++;
        }

        return i == a.length && j == b.length;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
