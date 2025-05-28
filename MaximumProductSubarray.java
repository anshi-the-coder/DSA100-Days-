class Solution {
    public int maxProduct(int[] nums) {
        int a = nums[0];
        int b = nums[0];
        int c = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            
            if (current < 0) {
                // Swap maxSoFar and minSoFar when encountering a negative
                int temp = c;
                c = b;
                b = temp;
            }

            c = Math.max(current, c * current);
            b = Math.min(current, b * current);

           a = Math.max(a, c);
        }

        return a;
    }
}
