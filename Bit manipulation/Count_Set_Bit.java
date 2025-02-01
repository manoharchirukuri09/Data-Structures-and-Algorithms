import java.util.*;
public class Count_Set_Bit {
    public static int count(int n ) { 
        int count =0;
        while(n>0){
            if((n & 1) !=0){
                count++;
            }
            n = n >> 1 ;
        }
        return count ;
    }
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = sc.nextInt();
       int result = count(n);
       System.out.println("Number of set bits in "+n+" is "+result);
    }
}
