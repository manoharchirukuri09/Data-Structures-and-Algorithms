import java.util.*;
public class Sum_of_Natural_Numbers {
    public static int Sum_of_Natural_Numbers(int n){
        if(n==1){
            return 1;
        }
        return n + Sum_of_Natural_Numbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Sum_of_Natural_Numbers(n));
    }
}
