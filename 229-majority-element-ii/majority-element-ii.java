class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        float t = n/3;
        ArrayList<Integer> ans =  new ArrayList<>();

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(t < count && !ans.contains(nums[i])){
               
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}


// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//        HashMap<Integer , Integer> h = new HashMap<>();
       
//         for (int i=0;i<nums.length;i++)
//         {
//         if (h.containsKey(nums[i]))
//         h.put(nums[i] , h.get(nums[i])+1);
//         else {
//             h.put (nums[i] , 1);

//         }
//         }
//         List<Integer> arr = new ArrayList<>();
//         for (int i:h.keySet())
//         {
//             if (h.get(i)>nums.length/3)
//             arr.add(i);
//         }
//         return arr; 
//     }
// }