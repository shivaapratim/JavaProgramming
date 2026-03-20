public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int[] freq = new int[256];
        int head = -1, tail = 0, ans = 0;

        while (tail < n) {

            // expand
            while (head + 1 < n && freq[s.charAt(head + 1)] == 0) {
                head++;
                freq[s.charAt(head)]++;
            }

            ans = Math.max(ans, head - tail + 1);

            // shrink
            if (tail <= head) {
                freq[s.charAt(tail)]--;
                tail++;
            } else {
                tail++;
                head = tail - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}