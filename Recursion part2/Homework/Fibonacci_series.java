public class Fibonacci_series {
    public static int series(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return series(n-1) + series(n-2);
    }
    public static void main(String[] args){ 
        System.out.println(series(10));
        
    }

}
