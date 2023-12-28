class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];
        int currProfit , maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            currProfit = prices[i]-min;
            maxProfit = Math.max(maxProfit,currProfit);
        }
        return maxProfit;
    }
}