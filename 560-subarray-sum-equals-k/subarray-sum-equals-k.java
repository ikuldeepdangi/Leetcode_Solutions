class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum , count=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            currSum = 0;
            for(int j=i;j<n;j++){
                currSum += nums[j];
                if(currSum == k){
                    count++;
                }
            }
        }
        return count ;
    }
}