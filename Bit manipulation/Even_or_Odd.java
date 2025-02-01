import java.util.*;
public class Even_or_Odd {
    public static void Even_or_Odd(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("It is a even number: " + n);
        }else{
            System.out.println("It is a odd number: " + n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Even_or_Odd(n);
    }
}
