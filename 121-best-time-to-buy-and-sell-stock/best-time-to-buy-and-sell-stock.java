class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min_price = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            
            if(min_price > prices[i]) min_price = prices[i];
            if(profit<prices[i]-min_price) profit = prices[i]-min_price; 
        }
       

        return profit;
    }
}
