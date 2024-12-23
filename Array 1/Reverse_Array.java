import java.util.*;
public class Reverse_Array {
    public static void Reverse_Array(int[] num){
        int first =0;
        int last = num.length-1;
        while(first<=last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num[]={2,4,6,8,10,12};
       Reverse_Array(num); 
       for(int i=0;i<num.length;i++) {
        System.out.print(num[i] + " ");
       }
    }
}

