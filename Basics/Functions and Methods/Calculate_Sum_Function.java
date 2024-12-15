import java.util.*;
public class Calculate_Sum_Function {
    public static int calculatesum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A Value: ");
        int a = sc.nextInt();
        System.out.println("Enter the B Value: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        int sum= calculatesum();
        System.out.println("The sum of Two numbers is: " + sum);
    }
}
