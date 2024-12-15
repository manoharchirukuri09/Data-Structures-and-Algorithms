import java.util.*;
public class Sum_with_parameters {
    public static int calculatesum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = calculatesum(a, b);
        System.out.println("The sum of two numbers: " + sum);
    }
}


