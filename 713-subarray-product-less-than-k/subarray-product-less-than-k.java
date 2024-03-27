class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int product = 1;
        int count = 0;
        int left = 0;

        for(int i = 0; i < nums.length; i++) {

            product *= nums[i];

            while(product >= k && left <= i) {
                product /= nums[left];
                left++;
            }

            count += i - left + 1;
        }

        return count;
    }
}

