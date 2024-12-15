import java.util.*;
public class Income_Tax_Calculator {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Amount: ");
       double amount = sc.nextDouble();
       if(amount <= 50000){
        System.out.println("No Tax " + amount);
       }else if(amount <= 100000){
        System.out.println("Tax is 10% of " + (amount*0.1));
       }else{
        System.out.println("Tax is 20% of " + (amount*0.2));
       }
   }
} 

