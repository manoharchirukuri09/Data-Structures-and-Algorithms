public class Buy_and_sell_stock_practice {
    public static int buy_and_sell_stock(int arr[]){
        int buy=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>buy){
                int profit = arr[i] - buy;
                 max_profit = Math.max(max_profit,profit);
            }else{
                buy = arr[i];
            }
        }
        return max_profit;
       
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6,  4};
        System.out.println(buy_and_sell_stock(arr));
    }
}
