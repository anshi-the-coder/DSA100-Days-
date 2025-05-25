import java.util.Arrays;

class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[(i + k) % n] = nums[i];

        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));  // [5, 6, 7, 1, 2, 3, 4]
    }
}
