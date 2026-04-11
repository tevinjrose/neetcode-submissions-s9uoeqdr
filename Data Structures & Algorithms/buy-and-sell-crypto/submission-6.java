class Solution {
    public int maxProfit(int[] prices) {

    int ptrBuy = 0;
    int ptrSell = 1;
    int maxProfit = 0;
    int profit = 0;

    for(int i = 0; i<prices.length-1; i++) {
        if(prices[ptrBuy] < prices[ptrSell]) {
            profit = prices[ptrSell] - prices[ptrBuy];
            if(profit > maxProfit) {
                maxProfit = profit;
            }
             ptrSell++;
        } else{
            ptrBuy = ptrSell;
            ptrSell++;
            
           
        }
    }

    return maxProfit;
        
    }
}
