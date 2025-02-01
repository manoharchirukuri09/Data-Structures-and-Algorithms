import java.util.*;
public class Decreasing_order {
    public static void Decreasing_order(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.print(n + " ");
         Decreasing_order(n-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       if(n>0){
        Decreasing_order(n);
       }else{
        System.out.println("Enter the positive number: ");
       }
    }
}

