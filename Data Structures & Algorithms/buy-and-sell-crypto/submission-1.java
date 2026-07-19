class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=1;
        int maxProfit = 0;

        while(sell<prices.length){
            if(prices[sell] - prices[buy]<=0){
                buy = sell;
            }
            else{
                if(prices[sell]-prices[buy] > maxProfit){
                    maxProfit = prices[sell]-prices[buy];
                }
            }
            sell++;
        }
        return maxProfit;
        /*int maxProfit = 0;
        int minBuyPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < minBuyPrice){
                minBuyPrice = prices[i];
            }
            if(prices[i] - minBuyPrice > maxProfit){
                maxProfit = prices[i] - minBuyPrice;
            }
        }

        return maxProfit;
        */
    }
}
