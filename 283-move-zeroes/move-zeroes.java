class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nzi = 0;
          
          for(int i=0;i<n;i++){
              if(nums[i]!=0){
                  nums[nzi]=nums[i];
                  nzi++;
              }
          }
        
        while(nzi<n){
            nums[nzi]=0;
            nzi++;
        }
    }
}
