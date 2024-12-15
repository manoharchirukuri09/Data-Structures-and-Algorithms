import java.util.*;
public class Logical_Operators {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number:");
   int a = sc.nextInt();
   System.out.println("Enter the second number:");
   int b = sc.nextInt();
   if(a == b){
    System.out.println("Both numbers are equal");

   }else if(a >b|| a<b){
    System.out.println("At least one number is greater");
   }else {
    System.out.println("Both numbers are not equal");
   }
   }

}
