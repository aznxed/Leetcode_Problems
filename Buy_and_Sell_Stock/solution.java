public class solution{

    public int maxProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }

            if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args){

    }
}