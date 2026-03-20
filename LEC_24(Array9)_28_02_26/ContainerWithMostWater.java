public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int tail = 0;
        int head = height.length - 1;
        int ans = 0;

        while (tail < head) {
            ans = Math.max(ans, Math.min(height[tail], height[head]) * (head - tail));

            if (height[head] < height[tail])
                head--;
            else
                tail++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}