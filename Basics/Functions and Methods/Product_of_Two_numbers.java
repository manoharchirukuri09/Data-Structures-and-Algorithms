import java.util.*;
public class Product_of_Two_numbers {
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int product = multiply(a, b);
        System.out.println("The product of Two Numbers: " + product);
    }
}

