class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n <= 1) {
            return n; 
        }

        int uniqueIndex = 0; 

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }
}
