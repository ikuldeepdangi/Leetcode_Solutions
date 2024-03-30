
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    private int atMostKDistinct(int[] nums, int k) {
        int n = nums.length;
        int[] frequency = new int[n + 1];
        int distinctCount = 0;
        int left = 0;
        int right = 0;
        int result = 0;

        while (right < n) {
            if (frequency[nums[right]] == 0) {
                distinctCount++;
            }
            frequency[nums[right]]++;

            while (distinctCount > k) {
                frequency[nums[left]]--;
                if (frequency[nums[left]] == 0) {
                    distinctCount--;
                }
                left++;
            }

            result += right - left + 1;
            right++;
        }

        return result;
    }
}
