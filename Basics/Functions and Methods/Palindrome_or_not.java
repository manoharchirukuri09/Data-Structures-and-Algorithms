import java.util.*;
public class Palindrome_or_not {
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse =0;
        while(n>0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        if(palindrome==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome number");
        }else{
            System.out.println(n + " is not a palindrome number");
        }
    }
}
