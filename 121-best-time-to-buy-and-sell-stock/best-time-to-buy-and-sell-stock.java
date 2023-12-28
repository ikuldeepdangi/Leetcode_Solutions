class Solution {
    public int maxProfit(int[] prices) {
        int min_Price = Integer.MAX_VALUE;
        int max_Profit = Integer.MIN_VALUE;

        for(int price : prices){
            min_Price = Math.min(min_Price , price);
            max_Profit = Math.max(max_Profit , price - min_Price);
        }

        return max_Profit;
    }
}