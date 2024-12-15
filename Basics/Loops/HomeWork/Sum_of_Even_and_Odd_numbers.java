import java.util.*;
public class Sum_of_Even_and_Odd_numbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       int sum_even = 0;
       int sum_odd = 0;
       for(int i=1;i<=n;i++){
        if(i%2==0){
            sum_even += i;
        }else{
            sum_odd += i;
        }
       }
       System.out.println("Sum of even numbers: "+sum_even);
       System.out.println("Sum of odd numbers: "+sum_odd);
    }
}

