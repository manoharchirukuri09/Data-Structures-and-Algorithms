import java.util.*;
public class Stock_span {
    public static void stockspan(int arr[], int span[]){
        Stack<Integer> s = new Stack<Integer>();
        span[0] =1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            while(!s.isEmpty() && curr>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevhigh = s.peek();
                span[i] = i-prevhigh;

            }
            s.push(i);
        }
    }
    public static void main(String[] args){
        int arr[] = {100,80,60,70,60,85,100};
        int span[]= new int[arr.length];
        stockspan(arr,span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i] + " ");
        }
    }
}
