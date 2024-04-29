class Solution {
    public int minOperations(int[] nums, int k) {
         int totalXOR = 0;
        for (int num : nums) {
            totalXOR ^= num;
        }
        
        if (totalXOR == k) {
            return 0;
        }
        
        int targetXOR = totalXOR ^ k;
        return countSetBits(targetXOR);
    }
    
    private int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}