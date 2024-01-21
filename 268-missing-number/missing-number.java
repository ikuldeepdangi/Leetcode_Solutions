class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //      if(nums[i]<min){
        //          min=nums[i];
        //      }
        // }
         
        Arrays.sort(nums);
        int z = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==z){
                z++;
            }else{
                return z;
            }
          
        }
          return n;
    }
}