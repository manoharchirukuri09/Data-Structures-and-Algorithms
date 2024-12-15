import java.util.*;
public class LeapYear_Or_Not {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the year");
     int year = sc.nextInt();
     if (year % 4 == 0 && year % 100 != 0) {
        System.out.println("It is a leap year" + year );
    
   }else if(year % 400 == 0){
    System.out.println("It is a leap year" + year);
   }else{
    System.out.println("It is not a leap year");
   }
} 
}

