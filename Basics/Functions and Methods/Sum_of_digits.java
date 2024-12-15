import java.util.*;
public class Sum_of_digits {
    public static int sumOfDigits(int n){
        int sum =0;
        while(n>0){
            int rem = n %10;
            sum = sum + rem;
            n = n/10; 
        }
            return sum;
        }
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int sum = sumOfDigits(n);
    System.out.println("The sum of digits: " + sum);
}
}



