import java.util.*;
public class Check_Power_of_2 {
    public static boolean Check_Power_of_2(int n){
        if(n<0){
            return false;
        }
        
        return (n & (n-1)) ==0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
    boolean result = Check_Power_of_2(n);
    System.out.println(n + " is a power of 2: " + result);
}
}
