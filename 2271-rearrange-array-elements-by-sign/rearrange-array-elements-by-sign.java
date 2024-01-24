class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int a =0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) {
                nums[i] = pos.get(a++);
            }else{
                nums[i] = neg.get(b++);
            }
        }
         return nums;
    }
}