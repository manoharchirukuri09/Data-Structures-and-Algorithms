import java.util.*;
public class Smallest_Element {
    public static int smallest_element(int[] num){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[]= {1,2,3,4,5,6,78,90,35};
        int result = smallest_element(num);
        System.out.println("The smallest element is " + result);
    }
}
