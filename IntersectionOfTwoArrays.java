class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num); // store unique elements
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // intersection only once
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }
}
