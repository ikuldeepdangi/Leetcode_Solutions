class Solution {
    public void moveZeroes(int[] nums) {
        int nzi = 0;
          
          for(int num : nums){
              if(num !=0){
                  nums[nzi]=num;
                  nzi++;
              }
          } 
        
        while(nzi<nums.length) {
            nums[nzi++]=0;
        }
    }
}
