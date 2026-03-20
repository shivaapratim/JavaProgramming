public class MaximumConsecutiveOnes3 {

    public static int longestOnes(int[] arr, int k) {
        int n = arr.length;

        int tail = 0, head = -1;
        int zeroCount = 0, ans = 0;

        while (tail < n) {

            // expand head
            while (head + 1 < n && (arr[head + 1] == 1 || zeroCount < k)) {
                head++;

                if (arr[head] == 0)
                    zeroCount++;
            }

            // update answer
            ans = Math.max(ans, head - tail + 1);

            // move tail
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
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;

        System.out.println(longestOnes(arr, k));
    }
}