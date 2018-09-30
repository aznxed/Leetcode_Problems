public class solution{

    public static int maxProfit(int prices[]) {
        int len = prices.length;
        int profit = 0;
        for(int a = 1; a < len; a++){
            if(prices[a] - prices[a-1] > 0){
                profit += prices[a] - prices[a-1];
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] prices = {7,5,5,4};
        maxProfit(prices);
    }
}