class Solution {
    boolean swapOnly1(String s1, String s2) {
        char[] a = s1.toCharArray();
        char temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        return new String(a).equals(s2);
    }

    boolean swapOnly2(String s1, String s2) {
        char[] a = s1.toCharArray();
        char temp = a[1];
        a[1] = a[3];
        a[3] = temp;
        return new String(a).equals(s2);
    }

    boolean swapBoth(String s1, String s2) {
        char[] a = s1.toCharArray();

        char temp1 = a[0];
        a[0] = a[2];
        a[2] = temp1;

        char temp2 = a[1];
        a[1] = a[3];
        a[3] = temp2;

        return new String(a).equals(s2);
    }

    public boolean canBeEqual(String s1, String s2) {
        return s1.equals(s2) || swapOnly1(s1, s2) || swapOnly2(s1, s2) || swapBoth(s1, s2);
    }
}