import java.util.*;
public class Binomial_coefficient {
    public static int factorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int binomial_coefficient(int n,int r){
        int fact_n= factorial(n);
        int fact_r = factorial(r);
        int n_r = factorial(n-r);
        int binomial = fact_n/(fact_r*(n_r));
        return binomial;
     
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        int result = binomial_coefficient(n, r);
        System.out.println("The binomial coefficient is: " + result);
        }
    }

  


