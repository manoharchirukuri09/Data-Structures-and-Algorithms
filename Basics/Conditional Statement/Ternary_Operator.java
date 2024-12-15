import java.util.*;
public class Ternary_Operator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number: ");
       int num = sc.nextInt();
       String  result = (num % 2 ==0)?"Even number" : "odd number";
       System.out.println(result);
    }
}

