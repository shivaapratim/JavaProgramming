public class TwoPointer {
    public static void main(String[] args) {

        int nums[] = { 0, 1, 0, 1, 0, 0, 1, 1, 0 };
        int k = 2;// no of flips

        int n = nums.length;
        int head = -1;
        int tail = 0;
        int ans = 0;
        int cnt0 = 0;

        while (tail < n) {
            while (head + 1 < n && (cnt0 + (1 - nums[head + 1]) <= k)) {// Condition

                head++;
                if (nums[head] == 0) {
                    cnt0++;
                }

            }
            ans = Math.max(ans, head - tail + 1); // answer update

            if (tail <= head) {
                if (nums[tail] == 0) {
                    cnt0--;
                }
                tail++;
            } else if (tail > head) {
                tail++;
                head = tail - 1;
            }

        }

        System.out.println(ans);

    }
}
