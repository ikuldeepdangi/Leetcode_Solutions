class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =  nums.length;
        int [] answer = new int [n];

        int prefix = 1;
        for(int i=0;i<n;i++){
            answer[i]=prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for(int j=n-1;j>=0;j--){
            answer[j]*=postfix;
            postfix *=  nums[j];
        } 


        return answer;
    }
}