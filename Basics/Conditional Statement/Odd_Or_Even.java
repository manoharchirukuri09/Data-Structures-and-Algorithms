import java.util.*;
public class Odd_Or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n % 2 ==0){
            System.out.println("The number is Even: " + n);
        }else{
            System.out.println("The number is Odd: " + n);
        }
    }
}

