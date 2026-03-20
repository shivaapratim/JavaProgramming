
public class Minimum_size_subarray {

    public static int minSubArrayLen(int k, int[] nums) {

        int n = nums.length;
        int head = -1;
        int tail = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        while (tail < n) {

            while (head + 1 < n && sum < k) {
                head++;
                sum += nums[head];
            }

            if (sum >= k) {
                ans = Math.min(ans, head - tail + 1);
            }

            if (tail <= head) {
                sum -= nums[tail];
                tail++;
            } else {
                tail++;
                head = tail - 1;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int k = 7;

        System.out.println(minSubArrayLen(k, nums));
    }
}
