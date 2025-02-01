import java.util.*;
public class Friendly_pair {
    public static int Friendly(int n){
        if(n==1 || n==2){
            return n;
        }
        // total ways single + pair
        //signal 
        int f1 = Friendly(n-1);
        //pair
        int f2 =  Friendly(n-1) * Friendly(n-2);
        //total ways
        int total = f1+f2;
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Total Number of Pairs: " + Friendly(n));
    }
}
