class Solution {            // 0 1 1 2
    public int longestConsecutive(int[] nums) {
        if(nums.length <=0) return 0 ;
        if(nums.length ==1) return 1 ;

        Arrays.sort(nums);
        int count=0;
        int max = 0;
        int temp = nums[0];

            for(int i=1;i<nums.length;i++){
                temp++;
                if(nums[i]==temp){
                    count++;
                } else if(nums[i]==temp-1){
                    temp--;
                    continue;
                }
                else{
                    temp=nums[i];
                    count=0;
                }

                max  = Math.max(count,max);
        }
        return max+1;
    }
}