class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        
        ArrayList<Integer> temp = new ArrayList<>();
    
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }
        
        int nt = temp.size();
        for(int i=0;i<nt;i++){
            nums[i]=temp.get(i);
        }
        for(int i = nt;i<n;i++){
            nums[i]=0;
        }

    }
}