package leetcode_08_2016;

public class E_121_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
    	if(prices.length <= 1) return 0;
        int maxProfit = 0;
        int lowestBuyPoint = prices[0];
        
        for(int price: prices) {
        	if(price < lowestBuyPoint) {
        		lowestBuyPoint = price;
        	} else {
        		if(price - lowestBuyPoint > maxProfit) {
        			maxProfit = price - lowestBuyPoint;
        		}
        	}
        }
        return maxProfit;
        
    }
}
