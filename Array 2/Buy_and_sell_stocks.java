public class Buy_and_sell_stocks {
    public static int Buy_and_sell_stocks(int prices[]){
        int buyprices= Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyprices){
                int profit = prices[i] - buyprices;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                buyprices = prices[i];
            }
        }
        return maxprofit;
    }

public static void main(String[] args){
    int[] prices = {7,1,5,3,6,4};
    int result = Buy_and_sell_stocks(prices);
    System.out.println("The max profit in the buy and sell is " + result);
}
}
