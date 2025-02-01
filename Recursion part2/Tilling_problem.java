import java.util.*;
public class Tilling_problem {
    public static int Tilling(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //recursive case
        //total two ways vertical + horizontal 
        // vertical
        int f1 = Tilling(n-1);
        //horizontal
        int f2 = Tilling(n-2);
        int total= f1+f2;
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println( "The Total number ways: " +Tilling(n));
    }
}
