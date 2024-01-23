class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0;i<n;i++){
            int value = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],value);
            //max = Math.max(max,value+1);
            if(max<value){
                max = value;
               ans = nums[i];
            }
        }

       return ans;
    }
}