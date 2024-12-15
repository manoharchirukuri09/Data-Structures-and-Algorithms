import java.util.*;
public class Math_functions {
    public static void Math_functions(int a, int b){
        int max = Math.max(a,b);
        System.out.println("Max " +max);
        int min = Math.min(a,b);
        System.out.println("min " + min);
        int sqrt =(int) Math.sqrt(a);
        System.out.println("sqrt " + sqrt);
        int pow =(int) Math.pow(a,b);
        System.out.println("pow " + pow);
        int avg =(a+b)/2;
        System.out.println("avg " + avg);
        int abs = Math.abs(a);
        System.out.println("abs " + avg);
      
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A value: ");
        int a = sc.nextInt();
        System.out.println("Enter the B value: ");
        int b = sc.nextInt();
     Math_functions(a,b);
         }
        }

