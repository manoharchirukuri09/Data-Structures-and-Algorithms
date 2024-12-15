import java.util.*;
public class Switch_Statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter the Operator : ");
        char character = sc.next().charAt(0);
        switch (character) {
            case '+' : 
            System.out.println("Addition of two numbers is: "+(a+b));
               break;
            case '-' : 
            System.out.println("Subtraction of two numbers is: "+(a-b));
            break;
            case '*' :
            System.out.println("Multiplication of two numbers is: "+(a*b));
            break;
            case '/' :
            System.out.println("Division of two numbers is : " + (a/b));
            break;
            case '%' :
            System.out.println("Modulus of two numbers is: "+(a%b));
            break;
            default:
            System.out.println("Invalid operator");

    }
}
}
