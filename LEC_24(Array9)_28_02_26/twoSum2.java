public class twoSum2 {

    public static int[] twoSum(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s < e) {
            if (nums[s] + nums[e] < target)
                s++;
            else if (nums[s] + nums[e] > target)
                e--;
            else
                return new int[] { s + 1, e + 1 };
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] res = twoSum(nums, target);
        for (int x : res)
            System.out.print(x + " ");
    }
}