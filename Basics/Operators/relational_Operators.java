import java.util.*;
public class relational_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("num1 is equal to num2 " + (num1==num2));
        System.out.println("num1 is not equal to num2 " + (num1!=num2));
        System.out.println("num1 is greater than num2 " + (num1 > num2));
        System.out.println("num1 is less than num2 " + (num1 < num2));
        System.out.println("num1 is greater than or equal to num2 " + (num1 >= num2));
        System.out.println("num1 is less than or equal to num2 " + (num1 <= num2));
    }
}

