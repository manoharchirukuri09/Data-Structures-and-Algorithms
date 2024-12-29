import java.util.*;
public class Palindrome_String {
    public static boolean isPalindrome(String str){
      int   n = str.length();
      for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
      }
      return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Is the String a Palindrome: "+isPalindrome(str));
    }
}
