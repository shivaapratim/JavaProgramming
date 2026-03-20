public class LongestSubarray1sAfterDelOneElement {

    public static int longestSubarray(int[] arr) {
        int n = arr.length;

        int tail = 0, head = -1;
        int zeroCount = 0, ans = 0;

        while (tail < n) {

            // expand
            while (head + 1 < n && (arr[head + 1] == 1 || zeroCount < 1)) {
                head++;
                if (arr[head] == 0)
                    zeroCount++;
            }

            // delete one element => window size - 1
            ans = Math.max(ans, head - tail);

            // shrink
            if (tail > head) {
                tail++;
                head = tail - 1;
            } else {
                if (arr[tail] == 0)
                    zeroCount--;
                tail++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1 };

        System.out.println(longestSubarray(arr));
    }
}