import java.util.*;
public class Increasing_order {
    public static void Increasing_order(int n){
        if(n==1){
            System.out.print("1" + " ");
            return ;
        }
        Increasing_order(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       if(n>0){
        Increasing_order(n);
       }else{
        System.out.println("Enter the positive number: ");
       }
    }
}

