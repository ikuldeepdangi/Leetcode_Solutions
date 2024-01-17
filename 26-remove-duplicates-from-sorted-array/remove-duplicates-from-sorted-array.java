class Solution {
    public int removeDuplicates(int[] nums) {
       int n = nums.length;
        int i = 0;
        
       while (i < n - 1) {
            if (nums[i] == nums[i + 1]) {
                int j = i + 1;
                while (j < n - 1) {
                    nums[j] = nums[j + 1];
                    j++;
                }
                n--;
            } else {
                i++;
            }
        }

        return n;
    }
}